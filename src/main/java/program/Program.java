package program;

import tree.Tree;

import java.io.*;
import java.util.*;

public class Program {
    public static void main(String[] args) throws IOException {
        //File file = new File("defects.txt");
        //Scheme scheme = new Scheme();
        //scheme.generateDefects(file);

        /*Map<String, String> df = scheme.defectFunction(file);
        System.out.println(df.size());
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("function-defect.txt"));
        bufferedWriter.write(df.size() + '\n');
        for (Map.Entry<String, String> entry : df.entrySet()) {
            bufferedWriter.write(entry.getKey() + " : " + entry.getValue() + '\n');
        }
        bufferedWriter.close();*/
        /*ArrayList<String> cF = scheme.centralFunctions(file1);
        for (int i = 0; i < cF.size(); i++) {
            System.out.println(cF.get(i));
        }*/


        File file1 = new File("functions.txt");
        ArrayList<String> functions = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
        while (bufferedReader.ready()) {
            functions.add(bufferedReader.readLine());
        }
        Tree tree = new Tree(functions, new ArrayList<Integer>());
        tree.buildTree();
        System.out.println(tree.highLevel);
        System.out.println(tree.test);
    }
}
