# SİGORTA YÖNETİM SİSTEMİ
Bu proje, bir sigorta firmasının müşterilerini ve sigorta poliçelerini yönetmek için bir yazılım sağlar. Projede "Bireysel" ve "Kurumsal" müşteri profilleri bulunmaktadır ve her bir müşteri profili için ayrı sınıflar ve ilişkiler tasarlanmıştır.

### Hesap (Account) Sınıfı
- Account sınıfı, müşterilerin hesap bilgilerini ve müşteri nesnesini içeren soyut bir sınıftır. Hesap bilgileri şunları içerir:

Kullanıcının login olma durumu (AuthenticationStatus)
Kullanıcı nesnesi (User)
Kullanıcının yaptırmış olduğu sigortaların listesi (ArrayList)
AuthenticationStatus adında bir enum, kullanıcının giriş durumunu başarılı veya başarısız olarak belirlemek için kullanılır.

- Hesap sınıfı içinde şu işlemler yapılabilmektedir:

Kullanıcının hesabına login olma işlemi (login)
Kullanıcının adreslerine ekleme ve çıkarma işlemleri (addAddress, removeAddress)
Kullanıcının sigorta poliçesi ekleyebilmesi için soyut bir fonksiyon (addInsurance) ve alt sınıflarda bu fonksiyonun doldurulması
Kullanıcının bilgilerini ekrana yazdıran bir fonksiyon (showUserInfo)
Kullanıcı (User) Sınıfı
- User sınıfı, müşterinin kişisel bilgilerini içeren sınıftır. Kullanıcı bilgileri şunlardan oluşur:

İsim (String)
Soyisim (String)
Email (String)
Şifre (String)
Meslek (String)
Yaş (int)
Adres listesi (ArrayList<Address>)
Sisteme son giriş tarihi (Date)
Ayrıca, User sınıfı içinde kullanıcının adreslerinin tutulduğu bir liste bulunur. Adres bilgisi iki türdür: Ev adresi (HomeAddress) ve İş adresi (BusinessAddress).

Adresler ve Adres Yönetimi
Adresler, Address isimli bir interface'den kalıtım alır ve her bir adres sınıfı bu interface'deki fonksiyonları uygular.

Adresleri ekleyip çıkarmak için AddressManager adında bir sınıf tasarlanmıştır. Bu sınıf, kullanıcının adres listesine eleman ekleme ve çıkarma işlemlerini gerçekleştirecek iki tane static fonksiyona sahiptir.

Sigorta Poliçeleri
Sigorta poliçeleri, Insurance adında soyut bir sınıftan türetilir ve her poliçe türü bu soyut sınıftan kalıtım alır. Insurance sınıfı şu bilgileri içerir:

Sigortanın ismi (String)
Sigortanın ücreti (double)
Sigortanın başlangıç-bitiş tarihi (Date)
Ayrıca, Insurance sınıfında calculate adında soyut bir fonksiyon bulunur ve bu fonksiyon alt sınıflarda doldurulur.

- Alt sınıflar: HealthInsurance (özel sağlık sigortası), ResidenceInsurance (konut sigortası), TravelInsurance (seyahat sigortası) ve CarInsurance (otomobil sigortası) şeklindedir. Her alt sınıf, calculate fonksiyonunu kendine göre hesaplayarak sigorta ücretini belirler.

AccountManager ve Program Yönetimi
- AccountManager sınıfı, müşteri hesaplarının tutulduğu bir TreeSet veri yapısı içerir. Bu sınıf, müşteri hesaplarının eklenmesi, çıkarılması ve login işlemlerinin gerçekleştirilmesi için gerekli fonksiyonları sağlar.

- ProgramManagement sınıfı ise tüm sistemi yönetir ve kullanıcı arayüzü ile etkileşim sağlar. Kullanıcıdan alınan bilgilere göre yeni kullanıcı hesapları oluşturulabilir, login işlemleri yapılabilir, adresler eklenip çıkarılabilir ve sigorta poliçeleri eklenip listelenebilir.

### Kullanım
Proje, ProgramManagement sınıfının main fonksiyonu ile başlatılır. Kullanıcı arayüzü sayesinde müşteri hesapları oluşturulabilir, login işlemleri yapılabilir ve sigorta poliçeleri eklenip listelenebilir. Tüm işlemler kullanıcı girdileri ve menüler aracılığıyla gerçekleştirilir.

Projenin çalışması için gerekli giriş bilgilerini klavyeden alarak sisteme giriş yapabilir ve hesabınıza ilişkin işlemleri gerçekleştirebilirsiniz.