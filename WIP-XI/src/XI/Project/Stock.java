/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;
/**
 *
 * @author WipCamp11
 */
public class Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = 10;
        int item = 5;
        int I;
        int J;
        int menu;
        System.out.println("1.Add\n2.Remove\n3.Check");
        System.out.print("Enter your choice : ");
        menu = sc.nextInt();
        if(menu==1){
            if(item < limit){
                System.out.print("Enter amout : ");
                I = sc.nextInt();
                if(item+I>limit){
                    System.out.println("Overload");
                }
                else{
                    item = item+I;
                    System.out.println("item = "+ item);
                    System.out.println("limit = "+limit);}   
            }else{
                System.out.println("Full");}    
        } else if(menu==2){
            if(item>0){
                System.out.print("Enter amout : ");
                J = sc.nextInt();
                if(J>item)
                {System.out.println("ไอเทมมีไม่พอให้ลบ");
                }else
                {
                 item = item-J;
                 System.out.println("item = "+item);
                 System.out.println("limit = "+limit);
                }
            }
        }else if(menu==3)
        {System.out.println("item = "+item);
         System.out.println("limit = "+limit);
        }else{System.out.println("No choice");}
            
        }
        }


