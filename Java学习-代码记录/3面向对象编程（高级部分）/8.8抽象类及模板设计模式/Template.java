package com.study.abstrcat_;

abstract public class Template {
    abstract public void job();

    public void time() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
