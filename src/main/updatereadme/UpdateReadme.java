package main.updatereadme;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpdateReadme {
    private static final String JAVA_FILES_DIRECTORY = "src/main";  // Adjusted to match your provided structure
    private static final String README_FILE_PATH = "README.md";  // Adjusted to match your provided structure

    public static void main(String[] args) throws IOException, InterruptedException {
        // Print the absolute path for debugging
        System.out.println("Java files directory: " + new File(JAVA_FILES_DIRECTORY).getAbsolutePath());
        System.out.println("README file path: " + new File(README_FILE_PATH).getAbsolutePath());

        if (!Files.exists(Paths.get(JAVA_FILES_DIRECTORY))) {
            System.err.println("Error: Directory does not exist: " + JAVA_FILES_DIRECTORY);
            return;
        }

        Set<String> existingFiles = getJavaFiles(JAVA_FILES_DIRECTORY);

        while (true) {
            Set<String> currentFiles = getJavaFiles(JAVA_FILES_DIRECTORY);
            if (!currentFiles.equals(existingFiles)) {
                existingFiles = currentFiles;
                updateReadme(currentFiles);
            }
            Thread.sleep(5000);  // Check for new files every 10 seconds
        }
    }

    private static Set<String> getJavaFiles(String directoryPath) throws IOException {
        try (Stream<Path> paths = Files.walk(Paths.get(directoryPath))) {
            return paths
                    .filter(Files::isRegularFile)
                    .map(Path::toString)
                    .filter(file -> file.endsWith(".java"))
                    .collect(Collectors.toSet());
        }
    }

    private static void updateReadme(Set<String> javaFiles) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(README_FILE_PATH))) {
            writer.write("# Code Challenges\n\n");
            writer.write("## List of Challenges\n\n");
            for (String file : javaFiles) {
                String fileName = new File(file).getName();
                String packageName = getPackageName(Paths.get(file));
                Path readmeParent = Paths.get(README_FILE_PATH).getParent();
                String relativePath;
                if (readmeParent != null) {
                    relativePath = readmeParent.relativize(Paths.get(file)).toString().replace("\\", "/");
                } else {
                    relativePath = Paths.get(file).toString().replace("\\", "/");
                }
                writer.write(String.format("- [%s](%s)\n", packageName, relativePath));
            }
        }
    }

    private static String getPackageName(Path file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("package ")) {
                    return line.replaceFirst("package ", "").replace(";", "");
                }
            }
        }
        return null;
    }
}
