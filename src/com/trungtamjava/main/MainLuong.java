/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trungtamjava.main;

import static com.trungtamjava.model.BaoVe.luongBaoVe;
import static com.trungtamjava.model.KeToan.luongKeToan;
import static com.trungtamjava.model.LeTan.luongLeTan;

/**
 *
 * @author Admin
 */
public class MainLuong {

    public static void main(String[] args) {
        System.out.println("Luong cua nhan vien le tan la : " + luongLeTan(120));
        System.out.println("Luong cua nhan vien ke toan la : " + luongKeToan(50));
        System.out.println("Luong cua bao ve la : " + luongBaoVe(230));

    }
}
