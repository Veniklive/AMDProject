package edu.zntu.projectm;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQL extends SQLiteOpenHelper {
    public SQL(@Nullable Context context, @Nullable String name, int version) {
        super(context, name, null, version);
    }

    private SQLiteDatabase db;
    private SQL connector;
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table Mythycals(_id integer primary key autoincrement, name varchar(20), image1 integer, image2 integer, image3 integer, description text);");

        //Записування даних у БД
        ContentValues cv = new ContentValues();

        //0id Строка
        cv.put("name", "Кентаври (грец. \"Κένταυροι\")"); cv.put("image1", R.drawable.centaurs1); cv.put("image2", R.drawable.centaurs2); cv.put("image3", R.drawable.centaurs3); cv.put("description", "Кентаври були напівлюдьми-напівкінями. Їх верхня половина була людиною, а нижня половина мала чотири ноги, як у коня. Взагалі, кентаври були гучними і вульгарними. Однак один кентавр на ім'я Хірон був розумним і вправним у навчанні. Він навчав багатьох грецьких героїв, у тому числі Ахілла та Ясона з аргонавтів.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        //1id Строка
        cv.put("name", "Цербер (грец. \"Κέρβερος\")"); cv.put("image1", R.drawable.cerberus1); cv.put("image2", R.drawable.cerberus2); cv.put("image3", R.drawable.cerberus3); cv.put("description", "Цербер — гігантський триголовий пес, який охороняв ворота підземного світу. Цербер був нащадком страшного монстра Тифона. Геракл мав схопити Цербера як один із своїх дванадцяти подвигів.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        //2id Строка
        cv.put("name", "Харибда (грец. \"Χάρυβδης\")"); cv.put("image1", R.drawable.charybdis1); cv.put("image2", R.drawable.charybdis2); cv.put("image3", R.drawable.charybdis3); cv.put("description", "Харибда була морським чудовиськом, яке мало форму гігантського виру. Будь-які кораблі, які підходили до Харибди, спускалися на дно моря. Кораблі, які проходили через Мессінську протоку, повинні були або пройти повз Харибду, або зіткнутися з морським чудовиськом Сциллою.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        //3id Строка
        cv.put("name", "Химера (грец. \"Χίμαιρα\")"); cv.put("image1", R.drawable.chimera1); cv.put("image2", R.drawable.chimera2); cv.put("image3", R.drawable.chimera3); cv.put("description", "Химера була гігантським монстром, який був поєднанням багатьох тварин, включаючи козу, лева та змію. Це був нащадок Тифона. У всій грецькій міфології Химеру боялися, оскільки вона могла дихати вогнем.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        //4id Строка
        cv.put("name", "Циклопи (грец. \"Κύκλωπες\")"); cv.put("image1", R.drawable.cyclopes1); cv.put("image2", R.drawable.cyclopes2); cv.put("image3", R.drawable.cyclopes3); cv.put("description", "Циклопи були одноокими велетнями. Вони були відомі тим, що зробили Зевса своїми громовержцями, а Посейдона – своїм тризубом. Під час своїх пригод в Одіссеї Одіссей також познайомився з Циклопом.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        //5id Строка
        cv.put("name", "Фурії (грец. \"Μανιές\")"); cv.put("image1", R.drawable.furies1); cv.put("image2", R.drawable.furies2); cv.put("image3", R.drawable.furies3); cv.put("description", "Фурії були літаючими істотами з гострими іклами та пазурами, які полювали на вбивць. Було три головні фурії, які були сестрами: Алекто, Тісіфона та Магаера. «Фурії» насправді є римською назвою. Греки називали їх Ерініями.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        //6id Строка
        cv.put("name", "Грифони (грец. \"Γκρίφινες\")"); cv.put("image1", R.drawable.griffins1); cv.put("image2", R.drawable.griffins2); cv.put("image3", R.drawable.griffins3); cv.put("description", "Грифон був поєднанням лева та орла. У нього було тіло лева, а голова, крила й кігті орла. Кажуть, що грифони жили в північній Греції, де вони охороняли величезний скарб.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        //7id Строка
        cv.put("name", "Гарпії (грец. \"Άρπυιες\")"); cv.put("image1", R.drawable.harpies1); cv.put("image2", R.drawable.harpies2); cv.put("image3", R.drawable.harpies3); cv.put("description", "Гарпії були літаючими істотами з жіночими обличчями. Гарпії відомі тим, що крадуть їжу Фінея кожного разу, коли він намагається поїсти. Ясон і аргонавти збиралися вбити гарпій, коли втрутилася богиня Ірида і пообіцяла, що гарпії більше не будуть турбувати Фінея.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        //8id Строка
        cv.put("name", "Гідра (грец. \"Ύδρα\")"); cv.put("image1", R.drawable.hydra1); cv.put("image2", R.drawable.hydra2); cv.put("image3", R.drawable.hydra3); cv.put("description", "Гідра була страшним монстром з грецької міфології. Це була велетенська змія з дев'ятьма головами. Проблема полягала в тому, що якщо відрізати одну голову, то швидко знову відростуть інші. Геракл убив гідру як один із своїх дванадцяти подвигів.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        //9id Строка
        cv.put("name", "Медуза (грец. \"Μέδουσα\")"); cv.put("image1", R.drawable.medusa1); cv.put("image2", R.drawable.medusa2); cv.put("image3", R.drawable.medusa3); cv.put("description", "Медуза була різновидом грецького чудовиська під назвою Горгона. У неї було жіноче обличчя, але замість волосся були змії. Кожен, хто подивиться в очі Медузи, стане каменем. Колись вона була прекрасною жінкою, але в покарання богиня Афіна перетворила її на Горгону.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        //10id Строка
        cv.put("name", "Мінотавр (грец. \"Μινώταυρος\")"); cv.put("image1", R.drawable.minotaur1); cv.put("image2", R.drawable.minotaur2); cv.put("image3", R.drawable.minotaur3); cv.put("description", "У Мінотавра була голова бика і тіло людини. Мінотавр родом з острова Крит. Він жив під землею в лабіринті під назвою Лабіринт. Щороку сім хлопчиків і сім дівчаток замикалися в лабіринті, щоб їх з'їв Мінотавр.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        //11id Строка
        cv.put("name", "Пегас (грец. \"Πήγασος\")"); cv.put("image1", R.drawable.pegasus1); cv.put("image2", R.drawable.pegasus2); cv.put("image3", R.drawable.pegasus3); cv.put("description", "Пегас був прекрасним білим конем, який міг літати. Пегас був конем Зевса і нащадком потворного чудовиська Медузи. Пегас допоміг герою Беллерофонту вбити химеру.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        //12id Строка
        cv.put("name", "Сатири (грец. \"Σάτυροι\")"); cv.put("image1", R.drawable.satyrs1); cv.put("image2", R.drawable.satyrs2); cv.put("image3", R.drawable.satyrs3); cv.put("description", "Сатири були напівкозлом-напівлюдиною. Це були миролюбні істоти, які любили добре проводити час. Вони також любили пожартувати над богами. Сатири були пов'язані з богом вина Діонісом. Сатир Сілен був чи не найвідомішим сатиром. Він був сином бога Пана.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        //13id Строка
        cv.put("name", "Сцилла (грец. \"Σκύλα\")"); cv.put("image1", R.drawable.scylla1); cv.put("image2", R.drawable.scylla2); cv.put("image3", R.drawable.scylla3); cv.put("description", "Сцилла була страшним морським чудовиськом з 12 довгими лапами-щупальцями і 6 собачими головами. Вона охороняла одну сторону Мессінської протоки, а її колега Харибда охороняла іншу.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        //14id Строка
        cv.put("name", "Сирени (грец. \"Σειρήνες\")"); cv.put("image1", R.drawable.sirens1); cv.put("image2", R.drawable.sirens2); cv.put("image3", R.drawable.sirens3); cv.put("description", "Сирени були морськими німфами, які своїми піснями заманювали моряків розбиватися об скелі їхніх островів. Як тільки моряк почув цю пісню, він не втримався. Одіссей зіткнувся з сиренами під час своїх пригод на Одіссеї. Він наказав своїм людям залити їм вуха воском, щоб вони не чули пісні, а потім прив’язав себе до корабля. Таким чином Одіссей міг почути їхню пісню і не потрапити в полон.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        //15id Строка
        cv.put("name", "Сфінкс (грец. \"σφίγγα\")"); cv.put("image1", R.drawable.sphinx1); cv.put("image2", R.drawable.sphinx2); cv.put("image3", R.drawable.sphinx3); cv.put("description", "Сфінкс мав тіло лева, голову жінки і крила орла. Сфінкс тероризував місто Фіви, вбиваючи всіх, хто не міг розгадати його загадку. Нарешті молодий чоловік на ім'я Едіп розгадав загадку Сфінкса, і місто було врятовано.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        //16id Строка
        cv.put("name", "Тифон (грец. \"Τύφωνας\")"); cv.put("image1", R.drawable.typhon1); cv.put("image2", R.drawable.typhon2); cv.put("image3", R.drawable.typhon3); cv.put("description", "Тифон був, мабуть, найстрашнішим і наймогутнішим з усіх монстрів у грецькій міфології. Його називали «батьком усіх чудовиськ», і навіть боги боялися Тифона. Тільки Зевс міг перемогти Тифона. Він ув'язнив чудовисько під горою Етна.");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();

        /*Xid Строка
        cv.put("name", "name (грец. \"name\")"); cv.put("image1", "@drawable/src.jpg"); cv.put("image2", "@drawable/src.jpg"); cv.put("image3", "@drawable/src.jpg"); cv.put("description", "SomeText");
        sqLiteDatabase.insert("Mythycals", null, cv);
        cv.clear();*/
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldV, int newV) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS Mythycals");
        onCreate(sqLiteDatabase);
    }
}