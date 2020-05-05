/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author minh
 */
public class MainFood {

    /**
     * @param args the command line arguments
     */
    ArrayList<Cargo> listFood = new ArrayList<>();
    
    public int showMenu(){
            System.out.println("nhap thong tin");
            System.out.println(
                    "1. Nhập thông tin hàng hóa\n" +
                    "2. Hiển thị thông tin hàng hóa\n" +
                    "3. Sắp xếp hàng hóa theo giá tăng dần\n" +
                    "4. Sắp xếp hàng hóa theo tên\n" +
                    "5. Tìm hàng hóa theo tên và nhà cung cấp\n" +
                    "6. Danh sách hàng hóa hết hàng\n" +
                    "7. Hiển thị hàng hóa Nông Sản có thuế lớn hơn 10%\n" +
                    "8. Hiển thị hàng hóa Thực Phẩm có hạn sử dụng nhỏ hơn 30 ngày\n" +
                    "9. Thoát"
            );
            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();
            return selection;
    }
    
    public void inputInformation(){
        Scanner click = new Scanner(System.in);
        System.out.println("tong so lan nhap");
        int n = click.nextInt();
        //int an = 0;
        for(int i = 0 ; i < n ; i++){
            System.out.println("xin vui long nhap lan:" + (i+1));
            Scanner input = new Scanner(System.in);
            System.out.println("|===chonso===|");
            System.out.println("ban chon so");
            System.out.println("1.nhap ");
            System.out.println("2.nhap nhan vien van phong");            
            int Chonso = input.nextInt();
            int an = 0;
            do{
                switch (Chonso) {
                case 1:
                    {
                        Cargo cargo = new AgriCargo();
                        cargo.inputData();
                        listFood.add(cargo);
                        break;
                    }
                case 2:
                    {
                        Cargo cargo = new FoodCargo();
                        cargo.inputData();
                        listFood.add(cargo);
                        break;
                    }
                default:
                    System.out.println("ban nhap sai lan so:"+ (i+1));
                    System.out.println("===========================");
                    break;
            }
            }while(an > 0 && an < 3);
            
        }
        
    }
    public static void main(String[] args) {
       MainFood food = new MainFood();
        int menu = 0;
        do{
            menu = food.showMenu();
            switch(menu){
                case 1:
                    food.inputInformation();
                    break;
//                case 2:
//                    EM.hienThiTT();
//                    break;
//                case 3:
//                    //EM.oderSalary();
//                    EM.sxCalsalary();
//                    break;
//                case 4:
//                    EM.sxtheotenBubbleSort();
//                    //EM.oderName();
//                    break;
//                case 5:
//                    EM.youngAge();
//                    break;
//                case 6:
//                    EM.saerchNameAndId();
//                    break;
                case 7:
                    System.out.println("Thoát");
                    break;
            }
            
            
        }while(menu > 0 && menu <7 );
        
        
    }
    
}
