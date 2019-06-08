package classesObjects.displayAgentCompany;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of agents :");
		int nbrOfAgent = Integer.parseInt(br.readLine());
		int companyChoice, agentChoice;
		
		for(int i = 0; i < nbrOfAgent; i++) {
			System.out.println("Select the company where the agent " + i + " is going to work :");
			System.out.println("1. Titanic\n2. Arcadia\n3. Umbrella corporation\n4. Omnicorp\nEnter your choice :");
			companyChoice = Integer.parseInt(br.readLine());
			System.out.println("1. New Agent\n2. Existing Agent\nEnter the choice :");
			agentChoice  = Integer.parseInt(br.readLine());
			System.out.println("Enter the agent details :");
			
			System.out.println("Enter the fee of the agent :");
		}
		
	}

}
