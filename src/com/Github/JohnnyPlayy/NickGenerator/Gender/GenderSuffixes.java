package com.Github.JohnnyPlayy.NickGenerator.Gender;

import com.Github.JohnnyPlayy.NickGenerator.Language.LanguageType;

public class GenderSuffixes {
	
	public static String[] getMaleSuffixes(LanguageType.Language language) {

		switch (language) {

		case ENGLISH:

			return new String[] {

					"Anderson", "Brown", "Davis", "Garcia", "Jackson",

					"Johnson", "Jones", "Martin", "Miller", "Moore",

					"Rodriguez", "Taylor", "Thomas", "Williams", "Wilson" 
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
					
					"Walker", "Hall", "Lee", "Allen", "Young", "King", "Wright" 
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
			
			return new String[] { "Smith", "Johnson", "Brown", "Taylor", "Anderson" }; // Default to English surnames
		}
	}

	public static String[] getUnisexSuffixes(LanguageType.Language language) {

		switch (language) {

		case ENGLISH:
			
			return new String[] { "Green", "Hill", "Gray", "Lake", "River" };

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