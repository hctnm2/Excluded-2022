import java.util.*;
class TrappingRainWater
{
  public static int trap(int[] height) {
        
    int maxh=0,pos=0;
    for(int i=0;i<height.length;i++)
    {
        if(maxh<=height[i])
        {pos=i;
        maxh=height[i];}
    }
    if(maxh==0)
        return 0;
  int ch=0;
        int i=0, ans=0;
        while(i!=pos){
            if(height[i]<=ch){
               // System.out.print()
                ans+=Math.abs(ch-height[i]);
            }else{
                ch=height[i];
            }
            i++;
        }
        i=height.length-1;ch=height[i];
         while(i!=pos){
            if(height[i]<=ch){
                ans+=Math.abs(ch-height[i]);
            }else{
                ch=height[i];
            }
            i--;
        }
        return ans;
    
}
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size");
    int n=sc.nextInt();
    System.out.print("Enter elevations ");
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    System.out.println("Amount of rain watre trapped : "+trap(a));
  }
}