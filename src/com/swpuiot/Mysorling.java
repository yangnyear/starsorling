package com.swpuiot;

public class Mysorling {

    public static void main(String[] args) {
        Mysorling thefirst = new Mysorling();
        thefirst.maopao();

    }

    public void maopao() {
        int s[] = {10, 2, 56, 78, 64, 28, 91, 45};
        for (int i = 1; i < s.length; i++) {
            for (int j = 0; j < s.length - 1; j++) {
                if (s[j] < s[j + 1]) {
                    int temp;
                    temp = s[j];
                    s[j] = s[j + 1];
                    s[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            System.out.print(" ");
        }
    }
}
