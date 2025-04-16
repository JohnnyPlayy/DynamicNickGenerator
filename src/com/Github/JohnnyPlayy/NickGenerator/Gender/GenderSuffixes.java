package com.Github.JohnnyPlayy.NickGenerator.Gender;

import com.Github.JohnnyPlayy.NickGenerator.Language.LanguageType;

public class GenderSuffixes {
	
	public static String[] getMaleSuffixes(LanguageType.Language language) {

		switch (language) {

        case ENGLISH:

            return new String[] { 
            		
                "Anderson", "Brown", "Davis", "Garcia", "Jackson", 
                
                "Johnson", "Jones", "Martin", "Miller", "Moore", 
                
                "Rodriguez", "Taylor", "Thomas", "Williams", "Wilson", 
                
                "Adams", "Allen", "Baker", "Barnes", "Bell", "Bennett", "Brooks", "Butler", 
                
                "Campbell", "Carter", "Clark", "Collins", "Cook", "Cooper", "Cox", "Edwards", 
                
                "Evans", "Fisher", "Flores", "Foster", "Gonzalez", "Gray", "Green", "Griffin", 
                
                "Hall", "Harris", "Hernandez", "Hill", "Howard", "Hughes", "James", "Kelly", 
                
                "King", "Lee", "Lewis", "Long", "Lopez", "Martin", "Martinez", "Mitchell", 
                
                "Murphy", "Nelson", "Parker", "Perez", "Phillips", "Powell", "Price", "Reed", 
                
                "Richardson", "Rivera", "Roberts", "Robinson", "Russell", "Sanders", "Scott", 
                
                "Simmons", "Smith", "Stewart", "Sullivan", "Torres", "Turner", "Walker", 
                
                "Ward", "Watson", "White", "Wood", "Wright", "Young", "Adkins", "Alvarez", 
                
                "Armstrong", "Arnold", "Austin", "Bailey", "Banks", "Bates", "Beck", "Berry", 
                
                "Black", "Blair", "Boone", "Boyd", "Bradley", "Bradshaw", "Briggs", "Bryant", 
                
                "Burns", "Bush", "Carpenter", "Carr", "Carter", "Chavez", "Clarke", "Clay", 
                
                "Clements", "Collier", "Conner", "Cooke", "Cooley", "Crawford", "Cross", 
                
                "Curtis", "Daniels", "Davidson", "Dixon", "Doyle", "Duncan", "Edwards", 
                
                "Ellis", "Erickson", "Farmer", "Ferguson", "Fields", "Fletcher", "Ford", 
                
                "Francis", "Franklin", "Freeman", "Frost", "Garner", "Gilbert", "Gill", 
                
                "Glover", "Goodman", "Gordon", "Grant", "Graves", "Gregory", "Griffith", 
                
                "Hamilton", "Hansen", "Harper", "Harrison", "Hart", "Harvey", "Hawkins", 
                
                "Hayes", "Henderson", "Hicks", "Higgins", "Hoffman", "Holland", "Holmes", 
                
                "Holt", "Hopkins", "Ingram", "Jacobs", "Jefferson", "Jenkins", "Jennings", 
                
                "Jimenez", "Jordan", "Keller", "Kennedy", "Kim", "Klein", "Lambert", 
                
                "Lane", "Larson", "Lawrence", "Lawson", "Leonard", "Lindsey", "Little", 
                
                "Logan", "Love", "Lowe", "Lucas", "Lynch", "Manning", "Marsh", "Marshall", 
                
                "Mason", "Matthews", "Maxwell", "McCarthy", "McDonald", "McGee", "Medina", 
                
                "Mendez", "Miles", "Mills", "Montgomery", "Mooney", "Moreno", "Morgan", 
                
                "Morrison", "Morton", "Moss", "Myers", "Navarro", "Neal", "Newton", "Norris", 
                
                "Nunez", "O'Brien", "Olson", "Ortega", "Owens", "Patterson", "Payne", "Pearson", 
                
                "Peck", "Perkins", "Perry", "Peters", "Peterson", "Phelps", "Porter", "Potter", 
                
                "Pratt", "Quinn", "Ramirez", "Randolph", "Ray", "Reeves", "Reyes", "Reynolds", 
                
                "Riley", "Rios", "Rivas", "Robbins", "Rogers", "Romero", "Rose", "Ross", 
                
                "Rowe", "Ryan", "Salazar", "Sampson", "Sanchez", "Saunders", "Schmidt", 
                
                "Schneider", "Schultz", "Schwartz", "Shaw", "Shelton", "Sherman", "Silva", 
                
                "Simpson", "Singleton", "Small", "Smithson", "Snow", "Soto", "Spears", 
                
                "Stanton", "Steele", "Stephens", "Stevens", "Stewart", "Stone", "Stout", 
                
                "Strickland", "Strong", "Stuart", "Summers", "Swanson", "Sweeney", "Talley", 
                
                "Tanner", "Tate", "Terrell", "Thomas", "Thompson", "Todd", "Torres", "Townsend", 
                
                "Travis", "Tucker", "Turner", "Underwood", "Valdez", "Vargas", "Vasquez", 
                
                "Vaughn", "Vega", "Velasquez", "Velez", "Vinson", "Wade", "Wagner", "Walker", 
                
                "Walters", "Walton", "Ward", "Warner", "Washington", "Waters", "Watkins", 
                
                "Watson", "Weaver", "Webb", "Weber", "Weeks", "Weiss", "Wells", "West", 
                
                "Whitehead", "Whitfield", "Whitney", "Wiggins", "Wilcox", "Wiley", "Wilkerson", 
                
                "Williams", "Williamson", "Willis", "Wilson", "Winters", "Wise", "Wolfe", 
                
                "Wong", "Wood", "Woodard", "Woods", "Wooten", "Wright", "Wyatt", "York", 
                
                "Young", "Zimmerman"
            };

		case SPANISH:

			return new String[] {

					"Álvarez", "Cruz", "Díaz", "Flores", "García",

					"González", "Gutiérrez", "Hernández", "López", "Martínez",

					"Morales", "Pérez", "Ramírez", "Rodríguez", "Ruiz",

					"Sánchez", "Torres", "Vargas" 
			};

		case FRENCH:
			
			return new String[] {

					"Bernard", "David", "Dubois", "Durand", "Fournier",

					"Garcia", "Laurent", "Lefèvre", "Leroy", "Martin",

					"Michel", "Moreau", "Petit", "Richard", "Robert",

					"Roux", "Simon", "Thomas", "Vincent" 
			};

		case GERMAN:

			return new String[] {

					"Bauer", "Becker", "Braun", "Fischer", "Hoffmann",

					"Klein", "Koch", "Krüger", "Meyer", "Müller",

					"Richter", "Schmidt", "Schneider", "Schröder", "Schulz",

					"Schwarz", "Wagner", "Weber", "Wolf", "Zimmermann" 
			};

		case RUSSIAN:

			return new String[] {

					"Богданов", "Федоров", "Голубев", "Иванов", "Кузнецов",

					"Михайлов", "Морозов", "Николаев", "Новиков", "Павлов",

					"Петров", "Попов", "Романов", "Семенов", "Сидоров",

					"Смирнов", "Соловьев", "Васильев", "Виноградов", "Воробьев" 
			};

		case JAPANESE:

			return new String[] {

					"田中", "山本", "小林", "中村", "高橋",

					"松本", "井上", "清水", "加藤", "藤本",

					"伊藤", "長谷川", "岡田", "吉田", "中川",

					"前田", "石川", "宮崎", "佐々木", "森田" 
			};

		case CHINESE:
			
			return new String[] {

					"王", "李", "张", "刘", "陈",

					"杨", "黄", "赵", "吴", "周",

					"徐", "孙", "马", "胡", "郭",

					"林", "何", "高", "唐", "于"

			};

		case KOREAN:

			return new String[] {

					"김", "이", "박", "최", "정",

					"강", "조", "윤", "장", "임",

					"한", "신", "유", "서", "황",

					"안", "송", "권", "오", "홍" 
			};

		case GREEK:

			return new String[] {

					"Παπαδόπουλος", "Νικολαΐδης", "Γεωργίου", "Χριστοδούλου",

					"Δημητρίου", "Ιωαννίδης", "Παπανικολάου", "Βασιλείου",

					"Ανδρεάδης", "Καραγιάννης", "Κωστόπουλος", "Παπαγεωργίου",

					"Θεοδώρου", "Κώτσης", "Κυριαζής", "Παναγιωτόπουλος",

					"Ζέρβας", "Σωτηρίου", "Μακρής", "Γιαννακόπουλος" 
			};

		case ARABIC:

			return new String[] {

					"الفاروق", "الحسن", "المصري", "الأحمد", "الخطيب",

					"النجار", "الفارسي", "التميمي", "الصبّاغ", "الزهراني",

					"الشامي", "الأنصاري", "المصطفى", "البخاري",

					"الرشيد", "الجباري", "الحاج", "الكريم", "الرومي", "القادر" 
			};

		case HINDI:

			return new String[] {

					"शर्मा", "वर्मा", "गुप्ता", "मेहता", "जैन",

					"कपूर", "चोपड़ा", "मल्होत्रा", "जोशी", "मिश्रा",

					"रेड्डी", "पटेल", "अग्रवाल", "कुलकर्णी", "देसाई",

					"नायर", "अयंगर", "सिन्हा", "पांडे", "चटर्जी" 
			};

		case HEBREW:

			return new String[] {

					"לוי", "כהן", "מזרחי", "אברהם", "ברק",

					"אליהו", "בן-עמי", "נחום", "שמעון", "גולדשטיין",

					"רוזנברג", "אדלר", "ויינשטיין", "קפלן", "פרידמן",

					"פרץ", "אשכנזי", "גולן", "סגל", "תמיר" 
			};

		case THAI:

			return new String[] {

					"สุขุมวิท", "ไชยพร", "วัฒนชัย", "ศรีสวัสดิ์",

					"คงสม", "ปัญญาชน", "สงขลา", "ธรรมศาสตร์",

					"นพดล", "บูรณะศิริ", "เฉลิมชัย", "รัตนโกสินทร์",

					"สถิตย์", "ศรีสุวรรณ", "นิมิตร", "วันชัย", "พิชัย",

					"กมล", "ฉัตรี", "ประเสริฐ" 
			};

		case VIETNAMESE:

			return new String[] {

					"Nguyễn", "Trần", "Lê", "Phạm", "Hoàng",

					"Huỳnh", "Phạm", "Vũ", "Võ", "Đặng",

					"Bùi", "Đỗ", "Ngọc", "Hồ", "Đinh",

					"Trương", "Ngô", "Lý", "Tôn", "Châu" 
			};

		case TURKISH:

			return new String[] {

					"Yılmaz", "Kaya", "Demir", "Çelik", "Şahin",

					"Aydın", "Öztürk", "Arslan", "Doğan", "Kılıç",

					"Yıldırım", "Koç", "Kurt", "Uslu", "Bozkurt",

					"Erdem", "Kara", "Aksoy", "Tan", "Polat" 
			};

		case ITALIAN:

			return new String[] {

					"Rossi", "Russo", "Ferrari", "Esposito", "Bianchi",

					"Romano", "Gallo", "Costa", "Fontana", "Conti",

					"Moretti", "Greco", "Lombardi", "Mancini", "Bruno",

					"Ricci", "Marino", "Giordano", "Rizzo", "De Luca" 
			};

		case POLISH:

			return new String[] {

					"Nowak", "Kowalski", "Wiśniewski", "Wójcik",

					"Kowalczyk", "Kamiński", "Lewandowski", "Zieliński",

					"Szymański", "Woźniak", "Dąbrowski", "Kozłowski",

					"Jankowski", "Mazur", "Kwiatkowski", "Zając",

					"Krawczyk", "Piotrowski", "Grabowski", "Nowicki" 
			};

		case CZECH_SLOVAK:

			return new String[] {

					"Novák", "Svoboda", "Novotný", "Dvořák", "Černý",

					"Procházka", "Kučera", "Veselý", "Horák", "Němec",

					"Marek", "Pokorný", "Pavel", "Jelínek", "Král",

					"Růžička", "Beneš", "Fiala", "Sedláček", "Šimek" 
			};

		case PORTUGUESE:

			return new String[] {

					"Silva", "Santos", "Oliveira", "Pereira", "Costa", "Carvalho",

					"Almeida", "Ferreira", "Rodrigues", "Martins", "Souza", "Gomes",

					"Araujo", "Nascimento", "Barbosa", "Ramos", "Lima", "Moura",

					"Castro", "Mendes", "Teixeira", "Vieira", "Monteiro", "Correia",

					"Dias", "Freitas", "Andrade", "Cardoso", "Moreira", "Cunha",

					"Campos", "Farias", "Tavares", "Rezende", "Machado", "Guimarães",

					"Amaral", "Borges", "Pinheiro", "Coelho", "Fonseca", "Ribeiro",

					"Aguiar", "Leite", "Peixoto", "Medeiros", "Cavalcanti", "Seabra",

					"Alencar", "Queiroz", "Araújo", "Ferraz", "Assis", "Prado",

					"Camargo", "Duarte", "Lacerda", "Neves", "Xavier", "Alvarenga",

					"Batista", "Moraes", "Vasconcelos", "Domingues", "Sales", "Bittencourt",

					"Antunes", "Cabral", "Cordeiro", "Torres", "Barros", "Bento",

					"Coutinho", "Figueiredo", "Pacheco", "Macedo", "Lobo", "França",

					"Valente", "Pimentel", "Siqueira", "Toledo", "Tenório", "Salvador",

					"Marques", "Henriques", "Barreto", "Pinto", "Quevedo", "Mota",

					"Paiva", "Couto", "Siqueira", "Braga", "Falcão", "Serra",

					"Caldeira", "Madruga", "Esteves", "Severino", "Quintela",

					"Pascoal", "Torrado", "Cabreira", "Carmona", "Correia", "Ventura",

					"Agostinho", "Veloso", "Lacerda", "Bicalho", "Negrão", "Galvão",

					"Escobar", "Coentrão", "Godinho", "Vilela", "Mendonça", "Pedrosa",

					"Saramago", "Travassos", "Furtado", "Gouveia", "Raposo",

					"Montenegro", "Meireles", "Caminha", "Bastos", "César", "Albergaria",

					"Rangel", "Portela", "Guedes", "Espíndola", "Lourenço",

					"Carneiro", "Frota", "Rebelo", "Alcântara", "Garrido", "Varela"

			};

		default:

			return new String[] { "Smith", "Johnson", "Brown", "Taylor", "Anderson" };
		}

	}

	public static String[] getFemaleSuffixes(LanguageType.Language language) {

		switch (language) {

        case ENGLISH:

            return new String[] { 
            		
                "Anderson", "Taylor", "Wilson", "Brown", "Harris", "Clark", "Lewis", "Robinson",
                
                "Walker", "Hall", "Lee", "Allen", "Young", "King", "Wright",
                
                "Adams", "Alexander", "Austin", "Bailey", "Baker", "Barnes", "Bell", "Bennett",
                
                "Brooks", "Butler", "Campbell", "Carter", "Collins", "Cook", "Cooper", "Cox",
                
                "Davis", "Diaz", "Dixon", "Edwards", "Evans", "Fisher", "Flores", "Foster",
                
                "Garcia", "Gomez", "Gonzalez", "Gray", "Green", "Griffin", "Harrison", "Henderson",
                
                "Hernandez", "Hill", "Howard", "Hughes", "Jackson", "James", "Jenkins", "Johnson",
                
                "Kelly", "Kennedy", "Kim", "Kingston", "Knight", "Lane", "Lawrence", "Lopez",
                
                "Martinez", "Mason", "Mendez", "Miller", "Mitchell", "Moore", "Morgan", "Morris",
                
                "Murphy", "Nelson", "Nguyen", "Ortiz", "Parker", "Perez", "Perry", "Peterson",
                
                "Phillips", "Powell", "Price", "Ramirez", "Reed", "Reyes", "Richardson", "Rivera",
                
                "Roberts", "Rodriguez", "Ross", "Russell", "Sanchez", "Sanders", "Scott", "Shaw",
                
                "Simmons", "Smith", "Stewart", "Sullivan", "Taylor", "Thomas", "Thompson",
                
                "Torres", "Turner", "Walker", "Ward", "Watson", "White", "Williams", "Wilson",
                
                "Wood", "Wright", "Young", "Abbott", "Ball", "Barker", "Bates", "Bauer", "Bennett",
                
                "Benson", "Black", "Bond", "Bowen", "Boyd", "Brady", "Bright", "Burns", "Burke",
                
                "Byrd", "Cameron", "Carlson", "Carroll", "Carter", "Castro", "Chambers", "Chavez",
                
                "Christensen", "Cline", "Cobb", "Collier", "Conner", "Conway", "Craig", "Cruz",
                
                "Daniels", "Davenport", "Davidson", "Dean", "Delaney", "Dennis", "Dorsey", "Dunn",
                
                "Ellis", "Emerson", "Estes", "Farrell", "Ferguson", "Fernandez", "Fleming", "Flowers",
                
                "Francis", "Frank", "Freeman", "Frost", "Fuller", "Gaines", "Gallagher", "Garner",
                
                "Gibbs", "Gilbert", "Gill", "Glover", "Gonzales", "Goodman", "Gordon", "Graves",
                
                "Guerrero", "Hansen", "Hardy", "Harper", "Hart", "Hawkins", "Hayes", "Hicks", "Hoffman",
                
                "Holland", "Hopkins", "Horn", "House", "Howell", "Hudson", "Huff", "Hunt", "Hunter",
                
                "Ingram", "Jacobs", "Jensen", "Jimenez", "Johnston", "Jordan", "Joseph", "Joyce",
                
                "Kane", "Keller", "Kidd", "Lamb", "Lambert", "Lane", "Lang", "Larson", "Lawson",
                
                "Leach", "Lee", "Levy", "Lindsey", "Little", "Love", "Lucas", "Lynch", "Maldonado",
                
                "Manning", "Marsh", "Marshall", "Martin", "Mathews", "Maxwell", "May", "McBride",
                
                "McCoy", "McDonald", "McGee", "McGuire", "McKenzie", "McKinney", "McLaughlin",
                
                "McMahon", "Meadows", "Mendez", "Meyer", "Miles", "Mills", "Montgomery", "Moody",
                
                "Moon", "Moore", "Morales", "Moss", "Mueller", "Mullins", "Munoz", "Myers", "Nash",
                
                "Navarro", "Neal", "Newton", "Nichols", "Nixon", "O'Connor", "O'Donnell", "O'Neal",
                
                "Oliver", "Olson", "Ortega", "Osborne", "Owens", "Palmer", "Park", "Parsons",
                
                "Payne", "Pearson", "Pena", "Peters", "Petty", "Phelps", "Pierce", "Pittman",
                
                "Porter", "Potter", "Pratt", "Quinn", "Ramsey", "Randall", "Ramos", "Rasmussen",
                
                "Reeves", "Reid", "Riley", "Robbins", "Rogers", "Rojas", "Rowe", "Salazar",
                
                "Sandoval", "Saunders", "Sawyer", "Schmidt", "Schneider", "Schultz", "Schwartz",
                
                "Sharp", "Shelton", "Sherman", "Silva", "Simmons", "Singleton", "Skinner", "Snow",
                
                "Snyder", "Sparks", "Spencer", "Stanton", "Steele", "Stephens", "Stevens", "Stone",
                
                "Strickland", "Strong", "Stuart", "Summers", "Sweeney", "Talley", "Tanner",
                
                "Thompson", "Thornton", "Todd", "Tucker", "Underwood", "Valdez", "Vargas", "Vasquez",
                
                "Vega", "Velez", "Vinson", "Wade", "Walker", "Wallace", "Warner", "Washington",
                
                "Waters", "Weaver", "Webb", "Weber", "Weeks", "Weiss", "Wells", "West", "Whitehead",
                
                "Whitfield", "Whitney", "Wiggins", "Wilcox", "Wilkerson", "Williamson", "Willis",
                
                "Wilson", "Winters", "Wise", "Wolfe", "Wong", "Wood", "Woodard", "Wright", "Wyatt",
                
                "York", "Young", "Zimmerman"
            };

		case SPANISH:
			
			return new String[] { 
					
					"Álvarez", "Cruz", "Díaz", "Flores", "García", "González", "Gutiérrez", "Hernández",
					
					"López", "Martínez", "Morales", "Pérez", "Ramírez", "Rodríguez", "Ruiz", "Sánchez", "Torres",
					
					"Vargas" 
			};

		case FRENCH:
			
			return new String[] { 
					
					"Martin", "Bernard", "Dubois", "Thomas", "Robert", "Richard", "Petit", "Durand",
					"Leroy", "Moreau", "Simon", "Laurent", "Michel", "Garcia", "David", "Bertrand", "Roux", "Vincent",
					"Fournier" 
			};

		case GERMAN:
			
			return new String[] { 
					
					"Müller", "Schmidt", "Schneider", "Fischer", "Weber", "Meyer", "Wagner", "Becker",
					"Hoffmann", "Schulz", "Koch", "Bauer", "Richter", "Klein", "Wolf", "Zimmermann", "Braun", "Krüger",
					"Schwarz" 
			};

		case RUSSIAN:
			
			return new String[] { 
					
					"Иванова", "Петрова", "Сидорова", "Смирнова", "Попова", "Кузнецова", "Васильева",
					
					"Новикова", "Федорова", "Михайлова", "Романова", "Николаева", "Соловьева", "Морозова", "Павлова",
					
					"Семенова", "Голубева", "Богданова", "Виноградова", "Воробьева" 
			};

		case JAPANESE:
			
			return new String[] { 
					
					"田中", "山本", "小林", "中村", "高橋", "松本", "井上", "清水", "加藤", "藤本", "伊藤", "長谷川", "岡田", "吉田",
					
					"中川", "前田", "石川", "宮崎", "佐々木", "森田" 
			};

		case CHINESE:
			
			return new String[] { 
					
					"王", "李", "张", "刘", "陈", "杨", "黄", "赵", "吴", "周", "徐", "孙", "马", "胡", "郭", "林", "何",
					
					"高", "唐", "于" 
			};

		case KOREAN:
			
			return new String[] { 
					
					"김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "신", "유", "서", "황", "안", "송",
					
					"권", "오", "홍" 
			};

		case GREEK:
			
			return new String[] { 
					
					"Παπαδοπούλου", "Νικολαΐδου", "Γεωργίου", "Χριστοδούλου", "Δημητρίου", "Ιωαννίδου",
					
					"Παπανικολάου", "Βασιλείου", "Ανδρεάδου", "Καραγιάννη", "Κωστοπούλου", "Παπαγεωργίου", "Θεοδώρου",
					
					"Κώτση", "Κυριαζή", "Παναγιωτοπούλου", "Ζέρβα", "Σωτηρίου", "Μακρή", "Γιαννακοπούλου" 
		};

		case ARABIC:
			
			return new String[] { 
					
					"الفاروق", "الحسن", "المصري", "الأحمد", "الخطيب", "النجار", "الفارسي", "التميمي",
					
					"الصبّاغ", "الزهراني", "الشامي", "الأنصاري", "المصطفى", "البخاري", "الرشيد", "الجباري", "الحاج",
					
					"الكريم", "الرومي", "القادر" 
			};

		case HINDI:
			
			return new String[] { 
					
					"शर्मा", "वर्मा", "गुप्ता", "मेहता", "जैन", "कपूर", "चोपड़ा", "मल्होत्रा", "जोशी",
					
					"मिश्रा", "रेड्डी", "पटेल", "अग्रवाल", "कुलकर्णी", "देसाई", "नायर", "अयंगर", "सिन्हा", "पांडे",
					
					"चटर्जी" 	
			};

		case HEBREW:
			
			return new String[] { 
					
					"לוי", "כהן", "מזרחי", "אברהם", "ברק", "אליהו", "בן-עמי", "נחום", "שמעון",
					
					"גולדשטיין", "רוזנברג", "אדלר", "ויינשטיין", "קפלן", "פרידמן", "פרץ", "אשכנזי", "גולן", "סגל",
					
					"תמיר" 
					
			};

		case THAI:
			
			return new String[] { 
					
					"สุขุมวิท", "ไชยพร", "วัฒนชัย", "ศรีสวัสดิ์", "คงสม", "ปัญญาชน", "สงขลา",
					
					"ธรรมศาสตร์", "นพดล", "บูรณะศิริ", "เฉลิมชัย", "รัตนโกสินทร์", "สถิตย์", "ศรีสุวรรณ", "นิมิตร",
					
					"วันชัย", "พิชัย", "กมล", "ฉัตรี", "ประเสริฐ" 
					
			};

		case VIETNAMESE:
			
			return new String[] { 
					
					"Nguyễn", "Trần", "Lê", "Phạm", "Hoàng", "Huỳnh", "Phạm", "Vũ", "Võ", "Đặng", "Bùi",
					
					"Đỗ", "Ngọc", "Hồ", "Đinh", "Trương", "Ngô", "Lý", "Tôn", "Châu" 
			};

		case TURKISH:
			
			return new String[] { 
					
					"Yılmaz", "Kaya", "Demir", "Çelik", "Şahin", "Aydın", "Öztürk", "Arslan", "Doğan",
					
					"Kılıç", "Yıldırım", "Koç", "Kurt", "Uslu", "Bozkurt", "Erdem", "Kara", "Aksoy", "Tan", "Polat" 
			};

		case ITALIAN:
			
			return new String[] { 
					
					"Rossi", "Russo", "Ferrari", "Esposito", "Bianchi", "Romano", "Gallo", "Costa",
					
					"Fontana", "Conti", "Moretti", "Greco", "Lombardi", "Mancini", "Bruno", "Ricci", "Marino",
					
					"Giordano", "Rizzo", "De Luca" 
					
			};

		case POLISH:
			
			return new String[] { 
					
					"Nowak", "Kowalski", "Wiśniewska", "Wójcik", "Kowalczyk", "Kamińska", "Lewandowska",
					
					"Zielińska", "Szymańska", "Woźniak", "Dąbrowska", "Kozłowska", "Jankowska", "Mazur", "Kwiatkowska",
					
					"Zając", "Krawczyk", "Piotrowska", "Grabowska", "Nowicka" 
					
			};

		case CZECH_SLOVAK:
			
			return new String[] { 
					
					"Nováková", "Svobodová", "Novotná", "Dvořáková", "Černá", "Procházková", "Kučerová",
					
					"Veselá", "Horáková", "Němcová", "Marková", "Pokorná", "Pavlová", "Jelínková", "Králová",
					
					"Růžičková", "Benešová", "Fialová", "Sedláčková", "Šimková"
					
			};

		case PORTUGUESE:

			return new String[] {

					"Silva", "Santos", "Oliveira", "Pereira", "Costa", "Carvalho",

					"Almeida", "Ferreira", "Rodrigues", "Martins", "Souza", "Gomes",

					"Araujo", "Nascimento", "Barbosa", "Ramos", "Lima", "Moura",

					"Castro", "Mendes", "Teixeira", "Vieira", "Monteiro", "Correia",

					"Dias", "Freitas", "Andrade", "Cardoso", "Moreira", "Cunha",

					"Campos", "Farias", "Tavares", "Rezende", "Machado", "Guimarães",

					"Amaral", "Borges", "Pinheiro", "Coelho", "Fonseca", "Ribeiro",

					"Aguiar", "Leite", "Peixoto", "Medeiros", "Cavalcanti", "Seabra",

					"Alencar", "Queiroz", "Araújo", "Ferraz", "Assis", "Prado",

					"Camargo", "Duarte", "Lacerda", "Neves", "Xavier", "Alvarenga",

					"Batista", "Moraes", "Vasconcelos", "Domingues", "Sales", "Bittencourt",

					"Antunes", "Cabral", "Cordeiro", "Torres", "Barros", "Bento",

					"Coutinho", "Figueiredo", "Pacheco", "Macedo", "Lobo", "França",

					"Valente", "Pimentel", "Siqueira", "Toledo", "Tenório", "Salvador",

					"Marques", "Henriques", "Barreto", "Pinto", "Quevedo", "Mota",

					"Paiva", "Couto", "Siqueira", "Braga", "Falcão", "Serra",

					"Caldeira", "Madruga", "Esteves", "Severino", "Quintela",

					"Pascoal", "Torrado", "Cabreira", "Carmona", "Correia", "Ventura",

					"Agostinho", "Veloso", "Lacerda", "Bicalho", "Negrão", "Galvão",

					"Escobar", "Coentrão", "Godinho", "Vilela", "Mendonça", "Pedrosa",

					"Saramago", "Travassos", "Furtado", "Gouveia", "Raposo",

					"Montenegro", "Meireles", "Caminha", "Bastos", "César", "Albergaria",

					"Rangel", "Portela", "Guedes", "Espíndola", "Lourenço",

					"Carneiro", "Frota", "Rebelo", "Alcântara", "Garrido", "Varela"

			};

		default:
			
			return new String[] { "Smith", "Johnson", "Brown", "Taylor", "Anderson" };
		}
	}

	public static String[] getUnisexSuffixes(LanguageType.Language language) {

		switch (language) {

        case ENGLISH:
            
            return new String[] { 
                "Green", "Hill", "Gray", "Lake", "River",
                
                "Adair", "Ainsley", "Ash", "Bailey", "Baker", "Bell", "Blake", "Bowie",
                
                "Bright", "Brook", "Cameron", "Carroll", "Casey", "Chandler", "Clarke", "Clay",
                
                "Cody", "Collins", "Cruz", "Dallas", "Dale", "Dana", "Darcy", "Dorian",
                
                "Drew", "East", "Eden", "Ellis", "Emerson", "Everett", "Finch", "Finley",
                
                "Fisher", "Frost", "Gale", "Gardner", "Gentry", "Graydon", "Hale", "Haven",
                
                "Hayden", "Hollis", "Hunter", "James", "Jordan", "Journey", "Justice", "Kai",
                
                "Keller", "Kendall", "Kennedy", "Kingsley", "Lane", "Lark", "Lennox", "London",
                
                "Logan", "Lowe", "Lyric", "Marley", "Mason", "Merritt", "Monroe", "Murphy",
                
                "Nash", "Oakley", "Parker", "Payton", "Perry", "Phoenix", "Quinn", "Reagan",
                
                "Reed", "Reese", "Remington", "Riley", "Rivera", "Robin", "Rowan", "Ryan",
                
                "Sage", "Sawyer", "Saylor", "Scout", "Shay", "Shelby", "Sky", "Skyler",
                
                "Spencer", "Sterling", "Stone", "Sutton", "Tatum", "Taylor", "Terry", "Tobin",
                
                "Trace", "True", "Tyler", "Val", "Walker", "Wells", "Whitney", "Winter",
                
                "Wren", "Wynn", "Zion", "Abbott", "Adams", "Alden", "Allen", "Anderson",
                
                "Archer", "Ashby", "Atwood", "Baker", "Banks", "Barber", "Barker", "Bates",
                
                "Beck", "Bellamy", "Benson", "Bishop", "Black", "Blair", "Blue", "Boone",
                
                "Bowie", "Boyd", "Bradley", "Bridges", "Brighton", "Bryant", "Bryson", "Carter",
                
                "Chase", "Clancy", "Clemens", "Cole", "Collier", "Cooper", "Corbin", "Courtney",
                
                "Crawford", "Cross", "Curtis", "Daniels", "Davidson", "Davis", "Day", "Dixon",
                
                "Douglas", "Dunn", "Eastman", "Eaton", "Ellington", "Ellsworth", "Emery", "Everest",
                
                "Fairchild", "Falk", "Fletcher", "Ford", "Francis", "Franklin", "Fulton", "Gaines",
                
                "Gardiner", "Gibbs", "Gibson", "Gilbert", "Gill", "Glenn", "Goodman", "Gordon",
                
                "Grayson", "Greene", "Griffith", "Hamilton", "Hammond", "Hancock", "Harding", "Harmon",
                
                "Harrington", "Harrison", "Hart", "Hartley", "Hawkins", "Hayes", "Henderson", "Hodges",
                
                "Holland", "Holt", "Howard", "Hudson", "Hughes", "Ingram", "Irving", "Jacobs",
                
                "Jefferson", "Jennings", "Jensen", "Johnston", "Jones", "Kane", "Keller", "Kendrick",
                
                "Kennard", "Lang", "Lawson", "Leighton", "Lennon", "Lindsey", "Livingston", "Logan",
                
                "Lowell", "Lynch", "Maddox", "Manning", "Marsh", "Maxwell", "McAllister", "McConnell",
                
                "McCoy", "McDonald", "McGee", "McIntyre", "McKenzie", "Meadows", "Mercer", "Miles",
                
                "Milton", "Mitchell", "Montgomery", "Moore", "Moran", "Morgan", "Morris", "Morrison",
                
                "Neal", "Nelson", "Norris", "Norton", "Nunez", "O'Connell", "O'Leary", "O'Neill",
                
                "Ortega", "Osborne", "Owens", "Paine", "Palmer", "Parsons", "Patterson", "Pearson",
                
                "Peters", "Phillips", "Porter", "Powers", "Prescott", "Price", "Quigley", "Ramsey",
                
                "Randolph", "Raymond", "Reeves", "Reid", "Rivers", "Roberts", "Rodgers", "Romero",
                
                "Ross", "Rowland", "Sanders", "Sawyer", "Scott", "Sharpe", "Shelton", "Shepard",
                
                "Sheridan", "Sherman", "Simpson", "Sinclair", "Slater", "Sloan", "Snow", "Spencer",
                
                "Stanley", "Stanton", "Steele", "Stephens", "Stevens", "Stewart", "Stone", "Sutton",
                
                "Swanson", "Tanner", "Thatcher", "Thompson", "Thornton", "Tobin", "Travis", "Tucker",
                
                "Turner", "Underwood", "Vance", "Vaughn", "Walker", "Wallace", "Walsh", "Warner",
                
                "Waters", "Watkins", "Weaver", "Webster", "West", "Wheeler", "Whitaker", "White",
                
                "Wilder", "Wilkins", "Williams", "Wilson", "Winters", "Wood", "Wright", "York",
                
                "Young", "Zimmerman"
            };

		case SPANISH:
			
			return new String[] { "Cruz", "Sol", "Paz", "Luz", "Mar" };

		case FRENCH:
			
			return new String[] { "Roux", "Noir", "Blanc", "Vert", "Beau" };

		case GERMAN:
			
			return new String[] { "Berg", "Stein", "Wald", "Hof", "Tal" };

		case RUSSIAN:
			return new String[] { "Надежда", "Свет", "Поляна", "Река", "Лес" };

		case JAPANESE:
			
			return new String[] { "山", "川", "森", "田", "林" };

		case CHINESE:
			
			return new String[] { "山", "水", "林", "田", "光" };

		case KOREAN:
			
			return new String[] { "강", "산", "하늘", "별", "달" };

		case GREEK:
			
			return new String[] { "Φως", "Θάλασσα", "Βουνό", "Ποταμός", "Άνεμος" };

		case ARABIC:
			
			return new String[] { "نور", "بحر", "سماء", "شمس", "قمر" };

		case HINDI:
			
			return new String[] { "कुमार", "सिंह", "राज", "चंद्र", "प्रकाश" };

		case HEBREW:
			
			return new String[] { "אור", "ים", "שמש", "ירח", "כוכב" };

		case THAI:
			
			return new String[] { "แสง", "น้ำ", "ดิน", "ฟ้า", "ดาว" };

		case VIETNAMESE:
			
			return new String[] { "Sơn", "Hải", "Phong", "Linh", "Bình" };

		case TURKISH:
			
			return new String[] { "Güneş", "Ay", "Deniz", "Dağ", "Orman" };

		case ITALIAN:
			
			return new String[] { "Verde", "Lago", "Collina", "Fiume", "Pietra" };

		case POLISH:
			
			return new String[] { "Zielony", "Góra", "Las", "Rzeka", "Pole" };

		case CZECH_SLOVAK:
			
			return new String[] { "Zelený", "Hora", "Les", "Řeka", "Pole" };

		case PORTUGUESE:

			return new String[] {

					"Silva", "Santos", "Oliveira", "Pereira", "Costa", "Carvalho",

					"Almeida", "Ferreira", "Rodrigues", "Martins", "Souza", "Gomes",

					"Araujo", "Nascimento", "Barbosa", "Ramos", "Lima", "Moura",

					"Castro", "Mendes", "Teixeira", "Vieira", "Monteiro", "Correia",

					"Dias", "Freitas", "Andrade", "Cardoso", "Moreira", "Cunha",

					"Campos", "Farias", "Tavares", "Rezende", "Machado", "Guimarães",

					"Amaral", "Borges", "Pinheiro", "Coelho", "Fonseca", "Ribeiro",

					"Aguiar", "Leite", "Peixoto", "Medeiros", "Cavalcanti", "Seabra",

					"Alencar", "Queiroz", "Araújo", "Ferraz", "Assis", "Prado",

					"Camargo", "Duarte", "Lacerda", "Neves", "Xavier", "Alvarenga",

					"Batista", "Moraes", "Vasconcelos", "Domingues", "Sales", "Bittencourt",

					"Antunes", "Cabral", "Cordeiro", "Torres", "Barros", "Bento",

					"Coutinho", "Figueiredo", "Pacheco", "Macedo", "Lobo", "França",

					"Valente", "Pimentel", "Siqueira", "Toledo", "Tenório", "Salvador",

					"Marques", "Henriques", "Barreto", "Pinto", "Quevedo", "Mota",

					"Paiva", "Couto", "Siqueira", "Braga", "Falcão", "Serra",

					"Caldeira", "Madruga", "Esteves", "Severino", "Quintela",

					"Pascoal", "Torrado", "Cabreira", "Carmona", "Correia", "Ventura",

					"Agostinho", "Veloso", "Lacerda", "Bicalho", "Negrão", "Galvão",

					"Escobar", "Coentrão", "Godinho", "Vilela", "Mendonça", "Pedrosa",

					"Saramago", "Travassos", "Furtado", "Gouveia", "Raposo",

					"Montenegro", "Meireles", "Caminha", "Bastos", "César", "Albergaria",

					"Rangel", "Portela", "Guedes", "Espíndola", "Lourenço",

					"Carneiro", "Frota", "Rebelo", "Alcântara", "Garrido", "Varela"

			};

		default:
			return new String[] { "Blue", "Sky", "Star", "Moon", "Sun" };
		}
	}
}