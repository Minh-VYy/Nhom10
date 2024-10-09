/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitaptuan5;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BaiTapTuan5 {
    public static Scanner sc=new Scanner(System.in);
    public static int TinhTong(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void DaoNguoc(int[] arr) {
        int a=0;
        int b=arr.length -1;
        while(a<b){
            int r=arr[a];
            arr[a]=arr[b];
            arr[b]=r;
            a++;
            b--;            
        }
    }
    public static void TangDan(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int r=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=r;
                }                  
            }
        }
    }
    //4.	Viết chương trình để tìm phần tử xuất hiện nhiều nhất trong một mảng
     public static void NHAP(int a[],int n){
        int i;
        for(i=0;i<n;i++){
           System.out.println("nhap phan tu thu "+i+":");
           a[i]= new Scanner(System.in).nextInt();

       }
     }
     public static void IN(int a[], int n){
         int i;
         System.out.println("day da nhap la: ");
         for(i=0;i<n;i++)
             System.out.print(" "+a[i]+"\n");
     }
     public static void KIEMTRA(int a[],int n){
        int mostFrequent = a[0];
        int maxCount = 1;
        for (int i = 0; i < n; i++) 
        {
            int dem = 1;
            for (int j = i + 1; j < n; j++)
                if (a[i] == a[j])
                    dem++;
            if (dem > maxCount)
            {
                maxCount = dem;
                mostFrequent = a[i];
            }
        }
        System.out.println("Phan tu xuat hien nhieu nhat la: " + mostFrequent + " (xuat hien " + maxCount + " lan)");
    }
     public static void KIEMTRA6(int a[],int n,int vt){
        int i;
        for(i=0;i<n;i++){
            if(i==vt)
            {
                System.out.println("tai vi tri "+vt+"co gia tri:"+a[i]);
                System.out.println("ban muon thay bang:");
                int x= new Scanner(System.in).nextInt();
                a[i]=x;
            }
        }

    }
    public static void main(String[] args) {
        Bai1();
        Bai2();
        Bai3();
        Bai4();
        Bai5();
        Bai6();
    }
    public static void Bai1() {
        System.out.println("\nBai 1:\n");
        int[] arr={1,2,3,4,5};
        int sum=TinhTong(arr);
        System.out.println("Tong phan tu mang la : "+ sum);
    }
    public static void Bai2() {
        System.out.println("\nBai 2:\n");
        int[] arr={1,2,3,4,5};
        System.out.println("Mang truoc khi dao nguoc : ");
        for (int i : arr){
            System.out.println(i+ " ");
        }
        DaoNguoc(arr);
        System.out.println("\nMang sau khi dao nguoc : ");
        for (int i : arr){
            System.out.println(i+ " ");
        }
    }
    public static void Bai3() {
        System.out.println("\nBai 3:\n");
        int[] arr={3,7,1,9,5};
        System.out.println("Mang ban dau: ");
        for(int i:arr){
            System.out.println(i+" ");
        }
        TangDan(arr);
        System.out.println("\nMang sau khi sap xep: ");
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
    public static void Bai4(){
        System.out.println("\nBai 4: \n");
        System.out.println("nhap so phan tu mang");
        int n;
        n= sc.nextInt();
        int[] arr = new int[n]; // Khai báo mảng có kích thước n
        NHAP(arr,n);
        IN(arr,n);
        KIEMTRA(arr,n);
    }
    public static void Bai5(){
        System.out.println("\nBai 5: \n");
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so phan tu n");
        int n= sc.nextInt();
        int arr[]= new int[n];
        NHAP(arr,n);
        IN(arr,n);
    }
    public static void Bai6(){
        System.out.println("\nBai 6:\n");
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so phan tu n");
        int n= sc.nextInt();
        int arr[]= new int[n];
        NHAP(arr,n);
        IN(arr,n);
        System.out.println("ban muon xoa,sua tai vi tri nao:");
        int vt= sc.nextInt();
        KIEMTRA6(arr,n,vt);
        IN(arr,n);
    }
    
}
