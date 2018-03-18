package com.example.hylandcentral;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.hylandcentral.model.Coach;
import com.example.hylandcentral.model.Team;
import com.example.hylandcentral.repository.CoachRepository;
import com.example.hylandcentral.repository.EmployeeRepository;

@SpringBootApplication
public class HylandcentralApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(HylandcentralApplication.class);

	@Autowired
	protected EmployeeRepository emplooyeeRepository;
	
	@Autowired
	protected CoachRepository coachRepository;

	public static void main(String[] args) {
		SpringApplication.run(HylandcentralApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		this.emplooyeeRepository.save(new Employee("Rohan Ghosh", "rghosh", "1123", "rohan.ghosh@hyland.com", "9830123456", "Architect","Nile", "709-02", "700015", "Arpan"));
		this.emplooyeeRepository.save(new Employee("Poulami Ghosh", "pghosh", "1124", "poulami.ghosh@hyland.com", "555123456", "QA","Nile", "709-03", "700016", "Arpan"));
		this.emplooyeeRepository.save(new Employee("Anirudha Das", "adas", "1125", "anirudha.das@hyland.com", "111234567", "Dev","Nile", "709-01", "700017", "Arpan"));
		
		this.emplooyeeRepository.save(new Employee("Kousik Pal", "kpal", "1126", "kousik.pal@hyland.com", "9830987654", "Architect", "Indus", "709-10", "700024", "Arpan"));
		this.emplooyeeRepository.save(new Employee("Sayan Chakravarti", "schakra", "1127", "sayan.chakravarti@hyland.com", "897888654", "Dev", "Indus", "709-09", "700023", "Arpan"));
		this.emplooyeeRepository.save(new Employee("Nitish Bhattacharya", "nbhatta", "1128", "nitish.bhattacharya@hyland.com", "236555897", "QA", "Indus", "709-08", "700022", "Arpan"));
		
		this.emplooyeeRepository.save(new Employee("Mayur Bhandopadyaya", "mbando", "1129", "mayur.bandopadyaya@hyland.com", "897066571", "Architect", "Rhine", "709-07", "700021", "Arpan"));
		this.emplooyeeRepository.save(new Employee("Nishant Kumar", "nkumar", "1130", "nishant.kumar@hyland.com", "2589631470", "Dev","Rhine", "709-06", "700020", "Arpan"));
		this.emplooyeeRepository.save(new Employee("Abhishek Sinha", "asinha", "1131", "abhishek.sinha@hyland.com", "7412589630", "QA", "Rhine", "709-05", "700019", "Arpan"));
		this.emplooyeeRepository.save(new Employee("Shubhankar Mukherjee", "smukherjee", "1132", "subhankar.mukherjee@hyland.com", "2014789635", "Dev", "Rhine", "709-04", "700018", "Arpan"));
		*/
		
		/*
		emplooyeeRepository.save(new Employee("Vikrant Chopra", "vchopra", "16238","vikrant.chopra@hyland.com", "9163624697", "Agile Coach", "KolScm", "719-01", "70001", "Dipankar Das"));
		emplooyeeRepository.save(new Employee("Arindam Chakraborty", "achakra", "16001","arindam.chakraborty@hyland.com", "9831114630", "Agile Coach", "KolScm", "719-02", "70002", "Dipankar Das"));
		emplooyeeRepository.save(new Employee("Soumya Sikdar", "ssikdar", "16002","soumya.sikdar@hyland.com", "9748724684", "Agile Coach", "KolScm", "719-03", "70003", "Dipankar Das"));
		emplooyeeRepository.save(new Employee("Suvonkar Dam", "sdam", "16003","suvonkar.dam@hyland.com", "9748290326", "Agile Coach", "KolScm", "719-04", "70004", "Dipankar Das"));
		emplooyeeRepository.save(new Employee("Subrata RoyChowdhury", "schodhury", "16004","subrata.roychowdhury@hyland.com", "9654782130", "Agile Coach", "KolScm", "719-05", "70001", "Dipankar Das"));
		emplooyeeRepository.save(new Employee("Anita Guha", "aguha", "16005","anita.guha@hyland.com", "89795463012", "Agile Coach", "KolScm", "719-06", "70001", "Dipankar Das"));
		*/
		
		/*
		Team team1 = new Team();
		team1.setTeam("Nile");
		
		Team team2 = new Team();
		team2.setTeam("Rhine");
		
		Team team3 = new Team();
		team3.setTeam("Indus");
		
		Coach coach = new Coach();
		coach.setUsername("vchopra");
		coach.addTeam(team1);
		coach.addTeam(team2);
		coach.addTeam(team3);
		
		this.coachRepository.save(coach);
		*/
	}
}
