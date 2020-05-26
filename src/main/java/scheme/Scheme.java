package scheme;

import java.io.*;
import java.util.*;

public class Scheme {
    private int x1;
    private int x2;
    private int x3;
    private int x4;
    private int x11;
    private int x22;
    private int x33;
    private int x44;
    private int notx1;
    private int notx2;
    private int notx3;
    private int notx4;
    private int notx11;
    private int notx22;
    private int notx33;
    private int notx44;

    public Scheme() {
        this.x1 = -2;
        this.x2 = -2;
        this.x3 = -2;
        this.x4 = -2;
        this.x11 = -2;
        this.x22 = -2;
        this.x33 = -2;
        this.x44 = -2;
        this.notx1 = -2;
        this.notx2 = -2;
        this.notx3 = -2;
        this.notx4 = -2;
        this.notx11 = -2;
        this.notx22 = -2;
        this.notx33 = -2;
        this.notx44 = -2;
    }

    public void generateDefects(File file) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        String str = "";
        int kol = 0;
        for (int i = 0; i < 3; i++) {
            if (notx44 < 2) {
                notx44++;
            }
            for (int j = 0; j < 3; j++) {
                if (notx33 < 2) {
                    notx33++;
                }
                for (int k = 0; k < 3; k++) {
                    if (notx22 < 2) {
                        notx22++;
                    }
                    for (int l = 0; l < 3; l++) {
                        if (notx11 < 2) {
                            notx11++;
                        }
                        for (int m = 0; m < 3; m++) {
                            if (notx4 < 2) {
                                notx4++;
                            }
                            for (int n = 0; n < 3; n++) {
                                if (notx3 < 2) {
                                    notx3++;
                                }
                                for (int o = 0; o < 3; o++) {
                                    if (notx2 < 2) {
                                        notx2++;
                                    }
                                    for (int p = 0; p < 3; p++) {
                                        if (notx1 < 2) {
                                            notx1++;
                                        }
                                        for (int q = 0; q < 3; q++) {
                                            if (x44 < 2) {
                                                x44++;
                                            }
                                            for (int r = 0; r < 3; r++) {
                                                if (x33 < 2) {
                                                    x33++;
                                                }
                                                for (int s = 0; s < 3; s++) {
                                                    if (x22 < 2) {
                                                        x22++;
                                                    }
                                                    for (int t = 0; t < 3; t++) {
                                                        if (x11 < 2) {
                                                            x11++;
                                                        }
                                                        for (int u = 0; u < 3; u++) {
                                                            if (x4 < 2) {
                                                                x4++;
                                                            }
                                                            for (int v = 0; v < 3; v++) {
                                                                if (x3 < 2) {
                                                                    x3++;
                                                                }
                                                                for (int w = 0; w < 3; w++) {
                                                                    if (x2 < 2) {
                                                                        x2++;
                                                                    }
                                                                    for (int x = 0; x < 3; x++) {
                                                                        if (x1 < 2) {
                                                                            x1++;
                                                                        }
                                                                        str = "";
                                                                        if (x1 > -1 && x1 < 2) {
                                                                            str += "x1 = " + x1 + " ";
                                                                        }
                                                                        if (x2 > -1 && x2 < 2) {
                                                                            str += "x2 = " + x2 + " ";
                                                                        }
                                                                        if (x3 > -1 && x3 < 2) {
                                                                            str += "x3 = " + x3 + " ";
                                                                        }
                                                                        if (x4 > -1 && x4 < 2) {
                                                                            str += "x4 = " + x4 + " ";
                                                                        }
                                                                        if (x11 > -1 && x11 < 2) {
                                                                            str += "x11 = " + x11 + " ";
                                                                        }
                                                                        if (x22 > -1 && x22 < 2) {
                                                                            str += "x22 = " + x22 + " ";
                                                                        }
                                                                        if (x33 > -1 && x33 < 2) {
                                                                            str += "x33 = " + x33 + " ";
                                                                        }
                                                                        if (x44 > -1 && x44 < 2) {
                                                                            str += "x44 = " + x44 + " ";
                                                                        }
                                                                        if (notx1 > -1 && notx1 < 2) {
                                                                            str += "notx1 = " + notx1 + " ";
                                                                        }
                                                                        if (notx2 > -1 && notx2 < 2) {
                                                                            str += "notx2 = " + notx2 + " ";
                                                                        }
                                                                        if (notx3 > -1 && notx3 < 2) {
                                                                            str += "notx3 = " + notx3 + " ";
                                                                        }
                                                                        if (notx4 > -1 && notx4 < 2) {
                                                                            str += "notx4 = " + notx4 + " ";
                                                                        }
                                                                        if (notx11 > -1 && notx11 < 2) {
                                                                            str += "notx11 = " + notx11 + " ";
                                                                        }
                                                                        if (notx22 > -1 && notx22 < 2) {
                                                                            str += "notx22 = " + notx22 + " ";
                                                                        }
                                                                        if (notx33 > -1 && notx33 < 2) {
                                                                            str += "notx33 = " + notx33 + " ";
                                                                        }
                                                                        if (notx44 > -1 && notx44 < 2) {
                                                                            str += "notx44 = " + notx44 + " ";
                                                                        }
                                                                        str += '\n';
                                                                        bufferedWriter.write(str);
                                                                        str = "";
                                                                        kol++;
                                                                    }
                                                                    x1 = -2;
                                                                }
                                                                x2 = -2;
                                                            }
                                                            x3 = -2;
                                                        }
                                                        x4 = -2;
                                                    }
                                                    x11 = -2;
                                                }
                                                x22 = -2;
                                            }
                                            x33 = -2;
                                        }
                                        x44 = -2;
                                    }
                                    notx1 = -2;
                                }
                                notx2 = -2;
                            }
                            notx3 = -2;
                        }
                        notx4 = -2;
                    }
                    notx11 = -2;
                }
                notx22 = -2;
            }
            notx33 = -2;
        }
        bufferedWriter.close();
        System.out.println(kol);
    }

    public Map<String, String> defectFunction(File defects) throws IOException {
        Map<String, String> df = new TreeMap<String, String>();
        BufferedReader bf = new BufferedReader(new FileReader(defects));
        String defect = "";
        int[] function = new int[16];
        String func = "";
        while (bf.ready()) {
            defect = bf.readLine();
            for (int i4 = 0; i4 < 2; i4++) {
                for (int i3 = 0; i3 < 2; i3++) {
                    for (int i2 = 0; i2 < 2; i2++) {
                        for (int i1 = 0; i1 < 2; i1++) {
                            initContacts(i1, i2, i3, i4);
                            handleDefect(defect);
                            function[i1 + i2 * 2 + i3 * 4 + i4 * 8] = getFunctionValue();
                        }
                    }
                }
            }
            func = Arrays.toString(function);
            if (!df.containsKey(func)) {
                df.put(func, defect);
                System.out.println(func + " : " + defect);
            }
        }
        return df;
    }

    private int getFunctionValue() {
        boolean x_1 = (x1 == 1);
        boolean x_2 = (x2 == 1);
        boolean x_3 = (x3 == 1);
        boolean x_4 = (x4 == 1);
        boolean x_11 = (x11 == 1);
        boolean x_22 = (x22 == 1);
        boolean x_33 = (x33 == 1);
        boolean x_44 = (x44 == 1);
        boolean notx_1 = (notx1 == 1);
        boolean notx_2 = (notx2 == 1);
        boolean notx_3 = (notx3 == 1);
        boolean notx_4 = (notx4 == 1);
        boolean notx_11 = (notx11 == 1);
        boolean notx_22 = (notx22 == 1);
        boolean notx_33 = (notx33 == 1);
        boolean notx_44 = (notx44 == 1);

        if ((x_1 && notx_2 && notx_3 && notx_4) ||
                (x_1 && notx_2 && x_3 && x_4) ||
                (notx_1 && x_2 && notx_3 && notx_4) ||
                (notx_1 && x_2 && x_3 && x_4) ||
                (notx_11 && notx_22 && x_33 && notx_44) ||
                (notx_11 && notx_22 && notx_33 && x_44) ||
                (x_11 && x_22 && x_33 && notx_44) ||
                (x_11 && x_22 && notx_33 && x_44)) {
            return 1;
        }
        return 0;
    }

    private void initContacts(int i1, int i2, int i3, int i4) {
        x11 = x1 = i1;
        x22 = x2 = i2;
        x33 = x3 = i3;
        x44 = x4 = i4;
        notx1 = notx11 = (x1 == 0 ? 1 : 0);
        notx2 = notx22 = (x2 == 0 ? 1 : 0);
        notx3 = notx33 = (x3 == 0 ? 1 : 0);
        notx4 = notx44 = (x4 == 0 ? 1 : 0);
    }

    private void handleDefect(String defect) {
        String contact = "";
        int i = 0;
        while (i < defect.length()) {
            if (defect.charAt(i) == ' ' && i < defect.length() - 1) {
                if (contact.equals("x1")) {
                    x1 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x2")) {
                    x2 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x3")) {
                    x3 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x4")) {
                    x4 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x11")) {
                    x11 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x22")) {
                    x22 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x33")) {
                    x33 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("x44")) {
                    x44 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx1")) {
                    notx1 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx2")) {
                    notx2 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx3")) {
                    notx3 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx4")) {
                    notx4 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx11")) {
                    notx11 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx22")) {
                    notx22 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx33")) {
                    notx33 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                    continue;
                }
                if (contact.equals("notx44")) {
                    notx44 = Integer.parseInt(String.valueOf(defect.charAt(i + 3)));
                    i += 5;
                    contact = "";
                }
            } else {
                contact += defect.charAt(i++);
            }
        }
    }

    public ArrayList<String> centralFunctions(File file) throws IOException {
        ArrayList<String> centr = new ArrayList<String>();
        ArrayList<String> functions = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (bufferedReader.ready()) {
            functions.add(bufferedReader.readLine());
        }
        bufferedReader.close();
        int[] mas;
        for (int i = 0; i < functions.size(); i++) {
            String f = functions.get(i);
            mas = toArray(f);
            boolean t = true;
            for (int j = 0; j < 16; j++) {
                mas[j] = (mas[j] == 1 ? 0 : 1);
                if (!functions.contains(Arrays.toString(mas))) {
                    t = false;
                    break;
                }
                mas[j] = (mas[j] == 1 ? 0 : 1);
            }
            if (t) {
                centr.add(f);
            }
        }
        return centr;
    }

    private int[] toArray(String s) {
        int[] mas = new int[16];
        int k = 1;
        for (int i = 0; i < 16; i++) {
            mas[i] = Integer.parseInt(String.valueOf(s.charAt(k)));
            k += 3;
        }
        return mas;
    }
}
