package com.study.abstrcat_;

public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.time();
    }
}
class AA extends Template{
    public void job() {
        int n1 = 0;
        for (int i = 1; i <= 10000000; i++) {
            n1 += i;
        }
    }
}