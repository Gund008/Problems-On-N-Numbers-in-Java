import java.util.Scanner;

class ArrayX
{
  protected int Arr[];

  public ArrayX(int iSize)
  {
      Arr=new int[iSize];
  }

 protected void accept()
  {
    Scanner sobj=new Scanner(System.in);

    for(int iCnt=0;iCnt<Arr.length;iCnt++)
    {
      System.out.println("Please Enter the:"+(iCnt+1));
      Arr[iCnt]=sobj.nextInt();
    }
  }

  protected void display()
  {
     System.out.println("Elements of Array are:");

     for(int iCnt=0;iCnt<Arr.length;iCnt++)
     {
       System.out.print(Arr[iCnt]+"\t");
     }
     System.out.println();
  }
}

class MarvellousX extends ArrayX
{
  public MarvellousX(int iSize)
    {
       super(iSize);
    }
  public int Addition()
  {
     int iSum=0;
     for(int iCnt=0;iCnt<Arr.length;iCnt++)
     {
        iSum=iSum + Arr[iCnt];
     }
     return iSum;
  }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class AdditionofAllArray
{
 public static void main(String[] args)
  {
     Scanner sobj=new Scanner(System.in);
     System.out.println("Please Enter the size of Array that You want to create:");
     int iSize=sobj.nextInt();

     MarvellousX aobj=new MarvellousX(iSize);
     aobj.accept();
     aobj.display();

    int iRet=aobj.Addition();
    System.out.println("Addtion of All Elements is:"+iRet);

  }
}
