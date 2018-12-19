// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of salespeople. 
// Displays sales entered by salesperson id and total sales for all salespeople,
// average sale, highest sale, and lowest sale.
// 
//
// **************************************************************** 

import java.util.Scanner;
import java.text.NumberFormat;

public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of salespeople: ");
        int salespeople = scan.nextInt();
        int[] sales = new int[salespeople];
        int sum;
        int maxSalesPerson = 0;
        int maxSales = 0;
        int minSalesPerson = 0;
        int minSales = 0;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        for ( int i=0; i<sales.length; i++ ){
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
            if ( i == 0 ){
                minSales = sales[i];
                maxSales = sales[i];
            }
            if ( sales[i] > maxSales ){
                maxSales = sales[i];
                maxSalesPerson = i;
            }
            if ( sales[i] < minSales ){
                minSales = sales[i];
                minSalesPerson = i;
            }
        }
        
        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++ ){
            System.out.println("     " + i + "         " + sales[i]);
            sum += sales[i];
        }
        
        System.out.println("\nTotal sales: " + money.format(sum) );
        System.out.println("Average sale: " + money.format(sum/salespeople));
        System.out.println("Salesperson " + maxSalesPerson + " had the highest sale with " + money.format(maxSales) ); 
        System.out.println("Salesperson " + minSalesPerson + " had the lowest sale with  " + money.format(minSales) );
        
        System.out.print("Enter the value to exceed: ");
        int exceed = scan.nextInt();
        int exceedCount = 0;
        for( int i=0; i < sales.length; i++ ){
            if( sales[i] > exceed ){
                System.out.println("Salesperson " + i + " Sales = " + money.format(sales[i]) );
                exceedCount++;
            }
        }
 
        System.out.println( exceedCount + " Salespeople exceeded " + money.format(exceed) );
    }
}