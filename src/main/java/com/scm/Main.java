package com.scm;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        FileSystem file = new File("Hello");
        FileSystem file1= new File("World");

        Directory directory = new Directory("directory");
        Directory directory1 = new Directory("directory2");

        directory.add(directory1);
        directory.add(file);
        directory.add(file1);

        directory.ls();
    }
}