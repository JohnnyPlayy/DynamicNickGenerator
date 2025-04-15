package com.Github.JohnnyPlayy.NickGenerator.Gender;

import com.Github.JohnnyPlayy.NickGenerator.Language.LanguageType;

public class GenderPrefixes {

    public static String[] getMalePrefixes(LanguageType.Language language) {

        switch (language) {

        case ENGLISH:

            return new String[] { "Mr", "Sir", "John", "Al", "Lord", "Captain", "Dr", "Professor", "Jack", "William", "Edward", "Richard", "George" };

        case SPANISH:

            return new String[] { "Don", "San", "Juan", "Manuel", "Carlos", "Miguel", "Pedro", "Fernando", "Luis", "Javier", "Andrés", "Antonio", "Dom" };

        case FRENCH:

            return new String[] { "Jean", "Pierre", "Louis", "Mon", "Claude", "François", "Michel", "Jacques", "Alain", "René", "Émile", "Gérard" };

        case GERMAN:

            return new String[] { "Herr", "Hans", "Fritz", "Karl", "Otto", "Wilhelm", "Heinrich", "Max", "Paul", "Peter", "Johann", "Georg", "Friedrich" };

        case RUSSIAN:

            return new String[] { "Иван", "Алексей", "Дмитрий", "Николай", "Сергей", "Владимир", "Михаил", "Павел", "Юрий", "Борис", "Андрей", "Григорий" };

        case JAPANESE:

            return new String[] { "タカ", "マサ", "ヒロ", "ヨシ", "ケン", "アキラ", "ナオキ", "シュン", "ユウタ", "トシ", "カズ", "キヨシ" };

        case CHINESE:

            return new String[] { "张", "王", "李", "陈", "赵", "刘", "杨", "黄", "周", "吴", "徐", "孙", "胡" };

        case KOREAN:

            return new String[] { "김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "오", "한" };

        case GREEK:

            return new String[] { "Γιώργος", "Δημήτρης", "Νίκος", "Κώστας", "Παναγιώτης", "Θεόδωρος", "Βασίλης", "Χρήστος", "Αντώνης", "Σπύρος" };

        case ARABIC:

            return new String[] { "عبد", "محمد", "أحمد", "علي", "حسن", "حسين", "خالد", "سعيد", "طارق", "ياسر", "سامي", "مروان" };

        case HINDI:

            return new String[] { "श्री", "राम", "मोहन", "अजय", "विजय", "सुरेश", "राज", "कुमार", "अमित", "सुनील", "दीपक", "मनोज" };

        case HEBREW:

            return new String[] { "אברהם", "יצחק", "יוסף", "דוד", "משה", "אהרן", "שמואל", "יהודה", "אליהו", "בנימין" };

        case THAI:

            return new String[] { "สม", "พร", "วิชัย", "อนันต์", "จักร", "เกรียง", "ศักดิ์", "ชัย", "ธน", "สุวรรณ" };

        case VIETNAMESE:

            return new String[] { "Nguyễn", "Trần", "Lê", "Phạm", "Bùi", "Đặng", "Vũ", "Hoàng", "Phan", "Võ", "Hồ" };

        case TURKISH:

            return new String[] { "Mehmet", "Ahmet", "Ali", "Mustafa", "Hüseyin", "Hasan", "İbrahim", "Osman", "Murat", "Yusuf" };

        case ITALIAN:

            return new String[] { "Giovanni", "Luca", "Marco", "Antonio", "Francesco", "Matteo", "Alessandro", "Andrea", "Giorgio", "Roberto" };

        case POLISH:

            return new String[] { "Jan", "Krzysztof", "Piotr", "Andrzej", "Tomasz", "Marek", "Adam", "Marcin", "Paweł", "Łukasz" };

        case CZECH_SLOVAK:

            return new String[] { "Jan", "Pavel", "Josef", "Martin", "Tomáš", "Miroslav", "Ladislav", "Jaroslav", "Vladimír", "Karel" };

        case PORTUGUESE:

            return new String[] { 

                "Sr", "Dom", "João", "Antônio", "Carlos", "José", "Luís", 

                "Pedro", "Fernando", "Rafael", "Henrique", "Manuel", "Augusto",

                "Guilherme", "Rodrigo", "Eduardo", "Filipe", "Paulo", "Vicente",

                "Mateus", "Tiago", "Davi", "André", "Martim", "Jorge", 

                "Francisco", "Leonardo", "Ricardo", "Bruno", "Otávio", "César", 

                "Alexandre", "Caio", "Sérgio", "Cláudio", "Vítor", "Hugo",

                "Álvaro", "Maurício", "Diego", "Rui", "Artur", "Renato", 

                "Márcio", "Marcelo", "Adriano", "Fábio", "Cássio", "Teodoro",

                "Danilo", "Nuno", "Emanuel", "Régis", "Isaac", "Rodolfo", 

                "Estevão", "Cristiano", "Geraldo", "Bernardo", "Armando", "Vicente",

                "Osvaldo", "Américo", "Celso", "Gilberto", "Alfredo", "Joaquim",

                "Elias", "Salvador", "Leandro", "Afonso", "Valentim", "Olavo",

                "Breno", "Severino", "Washington", "Hermes", "Edgar", "Dionísio", 

                "Tadeu", "Gustavo", "Marciano", "Anselmo", "Arnaldo", "Gilmar",

                "Genaro", "Flávio", "Evandro", "Raimundo", "Baltazar", "Horácio",

                "Saulo", "Érico", "Lázaro", "Orlando", "Péricles", "Adão",

                "Amaro", "Régulo", "Benício", "Gael", "Heitor", "Luciano",

                "Zacarias", "Valdir", "Pablo", "Romildo", "Josué", "Ivo", "Damião",

                "Jonas", "Pascoal", "Plínio", "Ubirajara", "Eurico", "Adriano",

                "Tarcísio", "Nestor", "Galdino", "Ernesto", "Vasco", "Ari", "Lauro",

                "Napoleão", "Ulisses", "Norberto", "Eustáquio", "Bartolomeu", "Caetano",

                "Áureo", "Vicentino", "Osmar", "Inácio", "Gonçalo", "Hermínio",

                "Fidélis", "Aquiles", "Benjamim", "Eugênio", "Gaspar", "Alcides",

                "Dorival", "Tibério", "Severo", "Ambrósio", "Tarcílio", "Juvêncio",

                "Rômulo", "Alcino", "Aristides", "Cipriano", "Flaviano", "Lívio" 
            };

        default:

            return new String[] { "Mr", "John", "Sir", "Al" };
        }

    }

    public static String[] getFemalePrefixes(LanguageType.Language language) {

        switch (language) {

        case ENGLISH:

            return new String[] { "Ms", "Lady", "Anna", "El", "Dr", "Professor", "Madam", "Elizabeth", "Catherine", "Margaret", "Diana", "Grace" };

        case SPANISH:

            return new String[] { "Doña", "San", "Maria", "Luz", "Isabel", "Carmen", "Sofia", "Teresa", "Elena", "Ana", "Paula" };

        case FRENCH:

            return new String[] { "Madame", "Marie", "Claire", "Sophie", "Isabelle", "Camille", "Élise", "Julie", "Cécile", "Anne" };

        case GERMAN:

            return new String[] { "Frau", "Anna", "Lena", "Sophie", "Klara", "Maria", "Therese", "Hanna", "Martha" };

        case RUSSIAN:

            return new String[] { "Анна", "Елена", "Мария", "Наталья", "Ольга", "Татьяна", "Ирина", "Светлана", "Ксения", "Виктория" };

        case JAPANESE:

            return new String[] { "さやか", "みほ", "あい", "ゆか", "りえ", "のりこ", "ひろこ", "まゆみ" };

        case CHINESE:

            return new String[] { "小", "陈", "李", "王", "林", "赵", "张", "杨" };

        case KOREAN:

            return new String[] { "김", "박", "최", "강", "장", "윤", "임" };

        case GREEK:

            return new String[] { "Μαρία", "Ελένη", "Αναστασία", "Κατερίνα", "Σοφία", "Ιωάννα", "Χριστίνα" };

        case ARABIC:

            return new String[] { "فاطمة", "عائشة", "زينب", "مريم", "هدى", "نور", "ليلى", "جميلة" };

        case HINDI:

            return new String[] { "श्रीमती", "गीता", "सीमा", "नीता", "कुसुम", "लक्ष्मी", "सविता", "अंजलि" };

        case HEBREW:

            return new String[] { "שרה", "רחל", "לאה", "מרים", "אילת", "דבורה", "חנה" };

        case THAI:

            return new String[] { "สม", "วรรณ", "พร", "รัตน์", "วิภา", "ศรี", "อนงค์" };

        case VIETNAMESE:

            return new String[] { "Ngọc", "Lan", "Hương", "Thu", "Mai", "Hà", "Dung" };

        case TURKISH:

            return new String[] { "Fatma", "Ayşe", "Emine", "Hatice", "Zeynep", "Elif", "Melek" };

        case ITALIAN:

            return new String[] { "Maria", "Anna", "Giulia", "Elena", "Francesca", "Chiara", "Silvia" };

        case POLISH:

            return new String[] { "Anna", "Maria", "Katarzyna", "Agnieszka", "Magdalena", "Ewa", "Joanna" };

        case CZECH_SLOVAK:

            return new String[] { "Marie", "Jana", "Eva", "Anna", "Lucie", "Petra", "Hana" };

        case PORTUGUESE:

            return new String[] { 

                "Sra", "Dona", "Maria", "Ana", "Clara", "Joana", "Luísa", 

                "Beatriz", "Helena", "Carla", "Marta", "Isabel", "Sofia", 

                "Gabriela", "Rita", "Catarina", "Mariana", "Fernanda", 

                "Patrícia", "Laura", "Viviane", "Letícia", "Aline", 

                "Verônica", "Elisa", "Tatiana", "Renata", "Cristina", 

                "Natália", "Juliana", "Lorena", "Carolina", "Camila", "Bianca",

                "Fátima", "Inês", "Regina", "Débora", "Luciana", "Rafaela",

                "Simone", "Andréa", "Adriana", "Michele", "Tatiane", "Eliane",

                "Cecília", "Emanuela", "Jéssica", "Vanessa", "Daniela", "Márcia",

                "Rosana", "Heloísa", "Glória", "Sandra", "Silvana", "Penélope",

                "Regiane", "Francisca", "Mônica", "Ester", "Clarice", "Evelyn",

                "Aparecida", "Tereza", "Leila", "Selma", "Ângela", "Alessandra", 

                "Noemi", "Lídia", "Julieta", "Tatiane", "Celeste", "Dalila",

                "Amélia", "Iolanda", "Flor", "Genoveva", "Rosa", "Marlene",

                "Carina", "Nádia", "Clarissa", "Ivone", "Jandira", "Josefa",

                "Maristela", "Bernadete", "Zélia", "Aurora", "Tatiane", "Odete",

                "Marileide", "Teresa", "Neide", "Carmem", "Leônia", "Priscila",

                "Solange", "Vilma", "Valéria", "Suzana", "Ágata", "Isis", "Elena",

                "Olga", "Irene", "Sônia", "Estela", "Magda", "Eulina", "Valda",

                "Dolores", "Clarinda", "Joanita", "Belmira", "Áurea", "Alcina",

                "Teodora", "Margarida", "Valquíria", "Jacinta", "Florinda", "Adelaide",

                "Quitéria", "Salete", "Violeta", "Anabela", "Amora", "Efigênia", 

                "Letícia", "Roxana", "Carmelita", "Filomena", "Celina", "Nair"
            };
            
        default:

            return new String[] { "Ms", "Lady", "Anna", "El" };
        }
    }

    public static String[] getUnisexPrefixes(LanguageType.Language language) {

        switch (language) {

        case ENGLISH:

            return new String[] { "Alex", "Sam", "Chris", "Taylor", "Jordan", "Morgan", "Casey", "Riley" };

        case SPANISH:

            return new String[] { "Alex", "Cris", "Sam", "Fran", "Carmen", "Pat" };

        case FRENCH:

            return new String[] { "Alex", "Sam", "Cam", "Fran", "Claude", "Dominique" };

        case GERMAN:

            return new String[] { "Alex", "Chris", "Sam", "Max", "Robin" };

        case RUSSIAN:

            return new String[] { "Саша", "Женя", "Валера", "Дима", "Кирилл", "Лев" };

        case JAPANESE:

            return new String[] { "アキ", "ヒロ", "ユウ", "ケイ", "ミナ" };

        case CHINESE:

            return new String[] { "小", "阿", "金", "大", "安" };

        case KOREAN:

            return new String[] { "민", "준", "현", "지", "수" };

        case GREEK:

            return new String[] { "Αλέξ", "Νικ", "Παναγιώτ", "Κυρ", "Μάριος" };

        case ARABIC:

            return new String[] { "نور", "علي", "هادي", "سامي", "كريم" };

        case HINDI:

            return new String[] { "अजय", "सूरज", "चेतन", "दीप", "अमित" };

        case HEBREW:

            return new String[] { "אלי", "יוסי", "דני", "גבי" };

        case THAI:

            return new String[] { "สม", "วิท", "จัน", "เกียรติ" };

        case VIETNAMESE:

            return new String[] { "Minh", "Anh", "Thanh", "Bình" };

        case TURKISH:

            return new String[] { "Ali", "Deniz", "Can", "Eren" };

        case ITALIAN:

            return new String[] { "Andrea", "Simone", "Gabriele", "Luca" };

        case POLISH:

            return new String[] { "Alex", "Kris", "Pat", "Sam" };

        case CZECH_SLOVAK:

            return new String[] { "Alex", "Petr", "Sam", "Milan" };

        case PORTUGUESE:

            return new String[] { 

                "Alex", "Cris", "Sam", "Fran", "Jo", "Lu", "Val", "André", 

                "René", "Mar", "Caio", "Noel", "Dani", "Vic", "Adri", "Nico",

                "Léo", "Toni", "Rafa", "Beni", "Gui", "Fê", "Manu", "Vivi",

                "Eli", "Max", "Gab", "Jess", "Rob", "Nati", "Chris", "Sasha",

                "Dudu", "Lari", "Pati", "Gabi", "Vini", "Cami", "Bia", "Nani",

                "Rô", "Juli", "Tati", "Mari", "Téo", "Nina", "Reni", "Lipe",

                "Mauri", "Nani", "Kiki", "Sami", "Zé", "Lari", "Dani", "Nati",

                "Vic", "Jô", "Luca", "Didi", "Lê", "Celi", "Tico", "Babi", 

                "Gigi", "Susi", "Tati", "Mimi", "Ceci", "Luli", "Tati", "Zizi",

                "Lulu", "Nunu", "Juli", "Riri", "Kaka", "Sasa", "Tutu", "Bubu",

                "Léo", "Jojo", "Pipi", "Fifi", "Rafa", "Ceci", "Titi", "Lala",

                "Ari", "Nico", "Tuca", "Zeca", "Lilo", "Miro", "Tuca", "Guto",

                "Beto", "Nino", "Lico", "Gato", "Teco", "Mino", "Rico", "Caco",

                "Neno", "Zuca", "Gui", "Lilo", "Bino", "Juli", "Rico", "Tico"
            };

        default:

            return new String[] { "Alex", "Sam", "Chris", "Taylor" };
        }
    }
}