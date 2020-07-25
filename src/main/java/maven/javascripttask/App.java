package maven.javascripttask;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class App 
{
    public static void main( String[] args )throws IOException
    {
    	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        List<Integer> num=new ArrayList<Integer>();
        System.out.println("Enter size of Integer list : ");
        int size1=Integer.parseInt(reader.readLine());
        System.out.println("Enter elements : ");
        for(int i=0;i<size1;i++)
        {
        	num.add(Integer.parseInt(reader.readLine()));
        }
        IntSummaryStatistics stats=num.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Average : "+stats.getAverage());
        List<String> list=new ArrayList<String>();
        System.out.println("Enter size of String list : ");
        int size = Integer.parseInt(reader.readLine());
        System.out.println("Enter elements : ");
        for(int i=0;i<size;i++)
        {
        	list.add(reader.readLine());
        }
        List<String> answer;
        answer=list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
        System.out.println("Answer List : "+answer);
    }
}
