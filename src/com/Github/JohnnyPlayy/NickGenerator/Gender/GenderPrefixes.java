package com.Github.JohnnyPlayy.NickGenerator.Gender;

import com.Github.JohnnyPlayy.NickGenerator.Language.LanguageType;

public class GenderPrefixes {

    public static String[] getMalePrefixes(LanguageType.Language language) {

        switch (language) {

        case ENGLISH:

            return new String[] { 
                "Mr", "Sir", "John", "Al", "Lord", "Captain", "Dr", "Professor", 
                
                "Jack", "William", "Edward", "Richard", "George", "Arthur", 
                
                "Henry", "Harry", "Charles", "Albert", "Robert", "James", 
                
                "Thomas", "Frederick", "Francis", "Samuel", "Andrew", "Theodore",
                
                "Victor", "Walter", "Eugene", "Howard", "Harold", "Douglas",
                
                "Martin", "Stanley", "Leonard", "Raymond", "Philip", "Vincent",
                
                "Gerald", "Patrick", "Lawrence", "Bruce", "Gregory", "Kenneth",
                
                "Donald", "Norman", "Edgar", "Clifford", "Hugh", "Herbert",
                
                "Percy", "Arnold", "Alfred", "Cecil", "Clarence", "Oliver",
                
                "Spencer", "Maxwell", "Milton", "Gordon", "Clinton", "Sidney",
                
                "Dennis", "Russell", "Harvey", "Leon", "Melvin", "Nathan",
                
                "Oscar", "Roland", "Wallace", "Archibald", "Clinton", "Douglas",
                
                "Nelson", "Newton", "Ross", "Sterling", "Tristan", "Warren",
                
                "Ashley", "Barnaby", "Benedict", "Bradley", "Bryce", "Chester",
                
                "Cornelius", "Cyril", "Desmond", "Dexter", "Duncan", "Elliot",
                
                "Emerson", "Ewan", "Fletcher", "Franklin", "Gareth", "Gilbert",
                
                "Grant", "Hamilton", "Harrison", "Jasper", "Julian", "Lance",
                
                "Lloyd", "Malcolm", "Marshall", "Maurice", "Montgomery", "Neville",
                
                "Orson", "Percival", "Quentin", "Reginald", "Robin", "Roderick",
                
                "Rupert", "Sebastian", "Silas", "Stanford", "Terrence", "Thaddeus",
                
                "Vernon", "Wesley", "Wilfred", "Wilbur", "Zachary", "Bartholomew",
                
                "Ambrose", "Emmett", "Everett", "Ferdinand", "Hollis", "Irving",
                
                "Jarvis", "Jeremiah", "Leopold", "Luther", "Marvin", "Mortimer",
                
                "Randolph", "Sherman", "Solomon", "Theobald", "Tobias", "Ulysses",
                
                "Wilhelm", "Winfred", "Xavier", "Yves", "Zebedee",
                
                "Abraham", "Adam", "Adrian", "Alan", "Albert", "Alexander", "Alfred", "Alvin", 
                
                "Amos", "Anderson", "Anthony", "Arnold", "Arthur", "Austin", "Barney",
                
                "Barry", "Benjamin", "Bernard", "Blake", "Brad", "Brandon", "Brendan", 
                
                "Brian", "Bruce", "Caleb", "Calvin", "Cameron", "Carl", "Carter", "Cedric", 
                
                "Charles", "Chris", "Christian", "Clarence", "Clark", "Clayton", "Cliff", 
                
                "Clinton", "Colin", "Connor", "Craig", "Curtis", "Cyril", "Daniel", "Darren", 
                
                "David", "Dean", "Dennis", "Derek", "Dexter", "Dominic", "Don", "Donald", 
                
                "Douglas", "Duncan", "Dwayne", "Dwight", "Earl", "Elijah", "Elliott", 
                
                "Emery", "Emmanuel", "Eric", "Ethan", "Eugene", "Evan", "Felix", "Floyd", 
                
                "Forrest", "Francis", "Frank", "Fred", "Frederick", "Gabriel", "Gareth", 
                
                "Garrett", "Gavin", "Gene", "George", "Gerald", "Gilbert", "Glen", "Gordon", 
                
                "Grant", "Greg", "Gregory", "Harold", "Harrison", "Harry", "Harvey", "Henry", 
                
                "Herbert", "Howard", "Hugh", "Hunter", "Ian", "Isaac", "Ivan", "Jack", 
                
                "Jacob", "James", "Jared", "Jason", "Jeff", "Jeffrey", "Jeremy", "Jerome", 
                
                "Jerry", "Jesse", "Jim", "Joe", "Joel", "John", "Jon", "Jonathan", "Jordan", 
                
                "Joseph", "Josh", "Joshua", "Julian", "Justin", "Keith", "Ken", "Kenneth", 
                
                "Kevin", "Kurt", "Kyle", "Lance", "Larry", "Lawrence", "Lee", "Leon", 
                
                "Leonard", "Leroy", "Lewis", "Lloyd", "Logan", "Louis", "Lucas", "Luke", 
                
                "Malcolm", "Marcus", "Mark", "Marshall", "Martin", "Mason", "Matthew", 
                
                "Maurice", "Max", "Melvin", "Michael", "Miles", "Mitchell", "Morgan", "Nathan", 
                
                "Nathaniel", "Neil", "Nelson", "Nicholas", "Nick", "Noah", "Norman", 
                
                "Oliver", "Oscar", "Owen", "Patrick", "Paul", "Peter", "Philip", "Phillip", 
                
                "Quentin", "Ralph", "Randall", "Ray", "Raymond", "Reed", "Rex", "Richard", 
                
                "Rick", "Ricky", "Robert", "Roger", "Roland", "Ronald", "Ross", "Roy", 
                
                "Russell", "Ryan", "Sam", "Samuel", "Scott", "Sean", "Shane", "Shawn", 
                "Sidney", "Simon", "Spencer", "Stanley", "Stephen", "Steve", "Stewart", 
                
                "Stuart", "Ted", "Terrence", "Terry", "Thomas", "Tim", "Timothy", "Todd", 
                
                "Tom", "Tony", "Travis", "Trent", "Trevor", "Troy", "Tyler", "Victor", 
                
                "Vincent", "Walter", "Wayne", "Wesley", "Will", "William", "Zachary"
            };

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

            return new String[] { 
                "Ms", "Lady", "Anna", "El", "Dr", "Professor", "Madam", "Elizabeth", 
                
                "Catherine", "Margaret", "Diana", "Grace", 
                
                "Zara", "Zoey", "Abby", "Adela", "Alana", "Alejandra", "Alexa", "Alexis", 
                
                "Alice", "Alicia", "Alisha", "Alison", "Amanda", "Amber", "Amy", "Ana", 
                
                "Anastasia", "Andrea", "Angela", "Angelina", "Anita", "Ann", "Anna", "Anne", 
                
                "Annette", "Annie", "April", "Ariana", "Arianna", "Arlene", "Ashley", "Audrey", 
                
                "Aurora", "Autumn", "Ava", "Barbara", "Beatrice", "Belinda", "Bella", "Bernadette", 
                
                "Beth", "Bethany", "Betty", "Beverly", "Bianca", "Bonnie", "Brenda", "Briana", 
                
                "Bridget", "Brittany", "Brooke", "Caitlin", "Candace", "Carla", "Carmen", "Carol", 
                
                "Carole", "Caroline", "Carolyn", "Casey", "Cassandra", "Cassidy", "Catherine", 
                
                "Cecilia", "Celeste", "Chanel", "Chantal", "Charlotte", "Chelsea", "Cheryl", 
                
                "Chloe", "Christina", "Christine", "Cindy", "Claire", "Clara", "Clarissa", 
                
                "Claudia", "Colleen", "Connie", "Corinne", "Crystal", "Cynthia", "Daisy", "Dana", 
                
                "Danielle", "Daphne", "Darcy", "Darlene", "Dawn", "Deanna", "Debbie", "Deborah", 
                
                "Debra", "Delilah", "Denise", "Desiree", "Diana", "Diane", "Dina", "Dominique", 
                
                "Donna", "Dora", "Dorothy", "Edith", "Eileen", "Elaine", "Eleanor", "Elena", 
                
                "Eliana", "Elisa", "Elise", "Eliza", "Elizabeth", "Ella", "Ellen", "Ellie", 
                
                "Elsa", "Elsie", "Elyse", "Emily", "Emma", "Erica", "Erika", "Erin", "Esmeralda", 
                
                "Estelle", "Esther", "Eva", "Evelyn", "Faith", "Faye", "Felicia", "Fern", 
                
                "Fiona", "Flora", "Florence", "Frances", "Francesca", "Gabriella", "Gabrielle", 
                
                "Gail", "Gemma", "Genevieve", "Georgia", "Geraldine", "Gia", "Gina", "Giselle", 
                
                "Glenda", "Gloria", "Grace", "Greta", "Gwendolyn", "Hailey", "Hannah", "Harriet", 
                
                "Hazel", "Heather", "Heidi", "Helen", "Helena", "Holly", "Hope", "Ida", "Iliana", 
                
                "Imogen", "India", "Inez", "Irene", "Iris", "Isabel", "Isabella", "Isabelle", 
                
                "Ivy", "Jacqueline", "Jade", "Jamie", "Jane", "Janet", "Janice", "Jasmine", 
                
                "Jean", "Jeanette", "Jeanne", "Jennifer", "Jessica", "Jillian", "Jo", "Joan", 
                
                "Joanna", "Jocelyn", "Jodie", "Josephine", "Joy", "Joyce", "Judith", "Judy", 
                
                "Julia", "Juliana", "Julie", "June", "Justine", "Kaitlyn", "Karen", "Katherine", 
                
                "Kathleen", "Kathryn", "Katie", "Katrina", "Kay", "Kayla", "Keira", "Kelly",
                
                "Kendra", "Kim", "Kimberly", "Krista", "Kristen", "Kristin", "Krystal", "Kyla", 
                
                "Kylie", "Lacey", "Lana", "Laura", "Lauren", "Laurie", "Leah", "Leanne", 
                
                "Leslie", "Lila", "Lillian", "Lilly", "Linda", "Lindsay", "Lisa", "Liz", 
                
                "Liza", "Lois", "Lorelei", "Lori", "Lorraine", "Louisa", "Louise", "Lucia", 
                
                "Lucille", "Lucy", "Luna", "Lydia", "Lynn", "Mabel", "Mackenzie", "Madeline", 
                
                "Madison", "Mae", "Maggie", "Mallory", "Mandy", "Mara", "Margaret", "Maria", 
                
                "Marian", "Marilyn", "Marina", "Marion", "Marissa", "Marjorie", "Martha", 
                
                "Mary", "Matilda", "Maureen", "Maxine", "Megan", "Melanie", "Melissa", "Melody", 
                
                "Mercedes", "Meredith", "Mia", "Michelle", "Mildred", "Mindy", "Miranda", 
                
                "Miriam", "Molly", "Monica", "Muriel", "Myra", "Nancy", "Naomi", "Natalia", 
                
                "Natalie", "Natasha", "Nell", "Nellie", "Nicole", "Nina", "Noelle", "Nora", 
                
                "Norma", "Olga", "Olive", "Olivia", "Opal", "Pamela", "Patricia", "Paula", 
                
                "Pauline", "Pearl", "Peggy", "Penelope", "Penny", "Phoebe", "Polly", "Priscilla", 
                
                "Rachel", "Renee", "Rhonda", "Rita", "Roberta", "Robin", "Rosa", "Rose", 
                
                "Rosemary", "Ruby", "Ruth", "Sabrina", "Sally", "Samantha", "Sandra", "Sara", 
                
                "Sarah", "Savannah", "Selena", "Serena", "Shannon", "Sharon", "Sheila", "Shelby", 
                
                "Shirley", "Sierra", "Sonia", "Sophia", "Sophie", "Stacey", "Stacy", "Stella", 
                
                "Stephanie", "Sue", "Summer", "Susan", "Suzanne", "Sylvia", "Tabitha", "Tamara", 
                
                "Tanya", "Tara", "Teresa", "Terry", "Thelma", "Theresa", "Tiffany", "Tina", 
                
                "Tracy", "Trisha", "Ursula", "Valerie", "Vanessa", "Vera", "Veronica", "Victoria", 
                
                "Violet", "Virginia", "Vivian", "Wanda", "Wendy", "Whitney", "Wilma", "Yvonne", 
                
                "Zoe", "Zara", "Zelda"
            };

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

            return new String[] { 
                "Alex", "Sam", "Chris", "Taylor", "Jordan", "Morgan", "Casey", "Riley",
                
                "Addison", "Aiden", "Ainsley", "Alexis", "Amari", "Angel", "Arden", "Ariel", 
                
                "Ash", "Ashton", "Aubrey", "August", "Avery", "Bailey", "Bennett", "Blake", 
                
                "Brett", "Brook", "Brooklyn", "Cameron", "Carson", "Carter", "Charlie", "Chris", 
                
                "Corey", "Dakota", "Dallas", "Darian", "Devin", "Drew", "Eden", "Elliot", 
                
                "Ellis", "Emerson", "Emery", "Finley", "Frankie", "Gray", "Harley", "Harper", 
                
                "Hayden", "Hunter", "Jamie", "Jay", "Jessie", "Jordan", "Jules", "Justice", 
                
                "Kai", "Kendall", "Kennedy", "Kyle", "Lane", "Lee", "Logan", "London", 
                
                "Luca", "Mackenzie", "Madison", "Marley", "Micah", "Morgan", "Noel", "Oakley", 
                
                "Parker", "Payton", "Phoenix", "Quinn", "Reagan", "Reese", "Remy", "Riley", 
                
                "River", "Robin", "Rowan", "Ryan", "Sage", "Sawyer", "Shay", "Skyler", 
                
                "Spencer", "Sterling", "Tanner", "Taylor", "Terry", "Toby", "Tristan", "Tyler", 
                
                "Val", "Wren", "Zion", "Adair", "Adrian", "Alden", "Alex", "Alva", "Amory",
                
                "Andi", "Arden", "Ari", "Ashby", "Ashton", "Auden", "Austyn", "Bellamy", 
                
                "Bennet", "Blaine", "Blue", "Briar", "Brighton", "Bryn", "Campbell", "Cary", 
                
                "Cass", "Cedar", "Channing", "Chase", "Clarke", "Cleo", "Colby", "Courtney", 
                
                "Cruz", "Dakotah", "Dane", "Darby", "Daryl", "Denver", "Dorian", "Elliott", 
                
                "Ellison", "Emery", "Ever", "Everest", "Everly", "Finch", "Fisher", "Florian", 
                
                "Gale", "Golden", "Haven", "Hollis", "Indigo", "Jackie", "Jaden", "Jalen", 
                
                "Jasper", "Jayden", "Karter", "Keegan", "Kelsey", "Kendrick", "Kingsley", 
                
                "Kit", "Kody", "Lake", "Laken", "Landry", "Lark", "Leighton", "Lennon", 
                
                "Lennox", "Lex", "Linden", "Lyric", "Marlow", "Merritt", "Monroe", "Nevada", 
                
                "Nico", "Oak", "Onyx", "Paris", "Perry", "Peyton", "Pippin", "Presley", 
                
                "Quincy", "Rain", "Reagan", "Reeve", "Remington", "Ren", "Rory", "Sailor", 
                
                "Salem", "Scout", "Selby", "Seven", "Shiloh", "Sloan", "Sunny", "Tatum", 
                
                "Teagan", "Tobin", "True", "Vale", "Whitney", "Winter", "Winslow", "Zephyr", 
                
                "Abbott", "Ace", "Afton", "Alix", "Alpha", "Arlo", "Armani", "Arrow", 
                
                "Atley", "Banks", "Banner", "Bay", "Baylor", "Berlin", "Bex", "Birch", 
                
                "Blaise", "Bliss", "Bond", "Bowie", "Breeze", "Brynn", "Byrd", "Cairo",
                
                "Canyon", "Carlin", "Carmen", "Cedar", "Chance", "Clancy", "Cooper", 
                
                "Corbin", "Cosmo", "Cove", "Cricket", "Cy", "Dale", "Dane", "Darcy", 
                
                "Day", "Dove", "Dream", "East", "Easton", "Echo", "Eliot", "Ellery", 
                
                "Ember", "Fable", "Fallon", "Fate", "Fenn", "Field", "Fox", "Frost", 
                
                "Gentry", "Glenn", "Graydon", "Halo", "Hart", "Haven", "Hero", "Hollis",
                
                "Indie", "Jace", "Jagger", "Jem", "Journey", "Justice", "Kaius", "Kale", 
                
                "Kam", "Kase", "Kings", "Knight", "Lane", "Lark", "Legend", "Lior", 
                
                "Lioren", "Loris", "Luca", "Lux", "Lyric", "Mars", "Maven", "Max", 
                
                "Merit", "Mika", "Miller", "Milan", "Navy", "Neo", "Oak", "Onyx", 
                
                "Page", "Paris", "Pax", "Pheonix", "Pim", "Pip", "Quill", "Rain", 
                
                "Rex", "Rome", "Roux", "Sage", "Scout", "Sequoia", "Seven", "Sky", 
                
                "Spruce", "Stone", "Storm", "Story", "Sutton", "Tate", "True", "Vale", 
                
                "Vesper", "West", "Willow", "Wren", "Zane", "Zephyr", "Zion"
            };

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