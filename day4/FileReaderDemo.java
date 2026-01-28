import java.io.*;
public class FileReaderDemo 
{
    public static void main(String[] args) 
	{
        BufferedReader br = null;
		
		try
		{
            // Step 1: Get filename from command line
            String filename = args[0];

            // Step 2: Open the file
            br = new BufferedReader(new FileReader(filename));

            // Step 3: Read and display file content
            String line;
            while ((line = br.readLine()) != null) 
			{
                System.out.println(line);
            }
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: No filename is provided");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error: The specified file does not exist.");
		}
		catch(IOException e)
		{
			System.out.println("Error: An Input/Output error occcured while reading the file.");
		}
		finally
		{
			try
			{
				if(br != null)
				{
					br.close();
				}
			}
			catch(IOException ex)
			{
				System.out.println("Error: Closing the file.");
			}
		}
     }
}