package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.UserService;
import business.concretes.UserManager;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	List<User> users=new ArrayList<User>();
	public InMemoryUserDao() {
		//Ge�i�i bir data ekledik. GetAll ve Get methodlarimizin calistigini anlamak icin.
		/*Neden Contructerda ekledik;
		
		Burada ekleme nedenimiz biliyorsunuz ki constructer mantigi aslinda bu sinif ilk �agrildiginda yapmas� gereken islemleri
		yazariz. Bunu ayni UserDao'yu UserManager'da cagirmamiz olarak d�s�nebiliriz. Oradaki mantik UserManager sinifi
		cagirildiginda bana bir tane UserDao nesnesi-sinifi g�nder diyoruz bkz;
		-- UserService userService=new UserManager(new InMemoryUserDao());     
		burada ise InMemoryUserDao cagirildiginda bana 2 tane User nesnesi �ret demis olduk
		
		*/
		System.out.println("---Kullan�c�lar---");
		User user1=new User(1, "Selim", "Ba�kaya", "selimbaskaya34@gmail.com", "123456");
		User user2=new User(2, "Engin", "Demirog", "engindemirog34@gmail.com", "123123");

		
		users.add(user1);
		users.add(user2);

	}
	@Override
	public void add(User user) {
		System.out.println("Kullan�c� Eklendi: "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� Silindi: "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� G�ncellendi: "+user.getFirstName()+" "+user.getLastName());		
	}

	/*Buradaki islem ise users.stream--> users listesini gez ve filtrele
	nasil filtreleyim--> degisken ismi(userdaki nesneye e�itlik eder bu sayede nesne �zelliklerine ulasabiliriz) esit ise 
	parametreden gelen id'ye diyerek filtrelemis olduk.
    Findfirst ise id ye g�re arama yaptigimiz icin tek bir kayit d�necektir((id/tcno/sicilno)=unique yani essiz anahtarlardir).
	Yani findfirst ile ilk gelen datayi getir demis oluyoruz. 
	Orelse ise eger eslesen bir id yok ise null getir diyoruz.Ayni islemi email icin yapiyoruz. 
	Burada da emaili essiz anahtar olarak d�s�nebiliriz :)
	*/
	@Override
	public User get(int id) {
		User user = users.stream()
				.filter(u -> u.getId() == id)
				.findFirst()
				.orElse(null);
		System.out.println("Kullan�c� ad�: "+user.getFirstName());
		return user;
	}
	@Override
	public User getEmail(String mail) {
		User user = users.stream()
				.filter(u -> u.geteMail() == mail)
				.findFirst()
				.orElse(null);
		
		return user;
	}
	@Override
	public List<User> getAll() {
		for (User user : users) {
			System.out.println(user.getFirstName());
		}
		System.out.println("----------------");
		return this.users;
	}

}
