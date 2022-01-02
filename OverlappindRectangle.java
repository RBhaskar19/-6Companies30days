import java.io.*;
import java.util.*;

class OverlappigR {
    static class Point
    {
        long x, y;
    }
    static long overlappingArea(Point l1, Point r1, Point l2, Point r2)
    {

        long area1 = Math.abs(l1.x - r1.x) * Math.abs(l1.y - r1.y);

        long area2 = Math.abs(l2.x - r2.x)* Math.abs(l2.y - r2.y);

        long x_dist = (Math.min(r1.x, r2.x) - Math.max(l1.x, l2.x));
        long y_dist = (Math.min(r1.y, r2.y) - Math.max(l1.y, l2.y));
        long areaI = 0;
        if( x_dist > 0 && y_dist > 0 )
        {
            areaI = x_dist * y_dist;
        }

        return (area1 + area2 - areaI);
    }
    public static void main(String[] args)throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String s[] = br.readLine().split(" ");
            int a[] = new int[4];
            for(int i=0; i<4; i++)
            {
                a[i] = Integer.parseInt(s[i]);
            }
            String s1[] = br.readLine().split(" ");
            int b[] = new int[4];
            for(int i=0; i<4; i++)
            {
                b[i] = Integer.parseInt(s1[i]);
            }
            Point l1 = new Point(),r1 = new Point(),l2 = new Point(),r2 = new Point();
            l1.x = a[0];
            l1.y = a[1];
            r1.x = a[2];
            r1.y = a[3];
            l2.x = b[0];
            l2.y = b[1];
            r2.x = b[2];
            r2.y = b[3];
            bw.write(overlappingArea(l1,r1,l2,r2)+"\n");
        }
        bw.close();
    }
}