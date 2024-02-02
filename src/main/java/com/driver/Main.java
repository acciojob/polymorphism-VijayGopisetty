package com.driver;

public class Main {
    public static void main(String[] args){
        Product p=new Product();
        int s1=p.product(2,3);
        int s2=p.product(2,3,4);
        double s3=p.product(2.0,3.0);
    }

    public static class Product{
        public int product(int a, int b){
            return a*b;
        }
        public int product(int a,int b,int c){
            return a*b*c;
        }
        public double product(double a,double b){
            return a*b;
        }
    }
}