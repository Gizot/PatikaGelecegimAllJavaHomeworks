# PatikaStore Ürün Yönetim Paneli

Bu proje, bir mağaza yönetim panelini simüle eden bir Java uygulamasıdır. Kullanıcılar, mağazada bulunan notebook ve 
cep telefonu ürünlerini ekleyebilir, listeleyebilir, filtreleyebilir ve silebilir. Aynı zamanda, mevcut markaları da 
listeleyebilirler.

## Kullanılan Sınıflar

1. Brand.java: Markaları tutmak ve listelemek için kullanılan sınıftır.
2. Notebook.java: Notebook ürünlerini temsil eden sınıftır. Ürünleri eklemek, listelemek, filtrelemek ve silmek için 
kullanılır.
3. Phone.java: Cep telefonu ürünlerini temsil eden sınıftır. Ürünleri eklemek, listelemek, filtrelemek ve silmek için
kullanılır.
4. Store.java: Ana uygulama sınıfıdır. Kullanıcıya işlem seçenekleri sunar ve kullanıcının seçimine göre ilgili 
sınıfları çağırır.
5. Main.java: Uygulamanın başlangıç noktasıdır. Store sınıfını çağırarak uygulamayı başlatır.

## Nasıl Çalıştırılır?

1. Projeyi bilgisayarınıza kopyalayın veya indirin.
2. Proje klasöründe terminali açın ve `javac Main.java` komutu ile projeyi derleyin.
3. Derleme tamamlandıktan sonra `java Main` komutu ile uygulamayı çalıştırın.
4. Program başladığında, kullanıcılar notebook işlemleri, cep telefonu işlemleri veya marka listeleme arasından seçim
yapabilirler.
5. İlgili seçim yapıldığında, ilgili işlem menüsü açılır ve kullanıcı işlemleri gerçekleştirebilir.

## Örnek Kullanım

1. Notebook İşlemleri:
    - Notebook eklemek için "1" seçeneğini seçin, istenilen bilgileri girin ve ürünü ekleyin.
    - Notebook listelemek için "2" seçeneğini seçin ve mevcut ürünleri listeleyin.
    - Notebook filtrelemek için "3" seçeneğini seçin, filtreleme türünü ve filtreleme değerini girin ve sonuçları 
görüntüleyin.
    - Notebook silmek için "4" seçeneğini seçin, silmek istediğiniz ürünün ID'sini girin ve ürünü silin.

2. Cep Telefonu İşlemleri:
    - Cep telefonu eklemek için "1" seçeneğini seçin, istenilen bilgileri girin ve ürünü ekleyin.
    - Cep telefonu listelemek için "2" seçeneğini seçin ve mevcut ürünleri listeleyin.
    - Cep telefonu filtrelemek için "3" seçeneğini seçin, filtreleme türünü ve filtreleme değerini girin ve sonuçları 
görüntüleyin.
    - Cep telefonu silmek için "4" seçeneğini seçin, silmek istediğiniz ürünün ID'sini girin ve ürünü silin.

3. Marka Listeleme:
    - Markaları listelemek için "3" seçeneğini seçin ve mevcut markaları görüntüleyin.

4. Çıkış Yapmak için:
    - Çıkış yapmak için "0" seçeneğini seçin ve uygulamayı sonlandırın.

## Proje Notları

- Proje içinde kullanılan sınıflar ve yönetim paneli, verileri geçici olarak ArrayList ve TreeSet yapısında 
saklamaktadır. Gerçek bir veritabanı kullanmak için bu yapının bir veritabanı ile değiştirilmesi gerekmektedir.

- Uygulama, kullanıcı dostu arayüze sahip olacak şekilde geliştirilebilir. Örneğin, işlem seçenekleri ve 
kullanıcıdan alınacak girdiler daha anlaşılır hale getirilebilir.

- Projenin geliştirilmesi ve iyileştirilmesi için geri bildirimler kabul edilir.

- Bu proje, temel seviyede Java programlama becerilerini geliştirmek ve konsol tabanlı uygulamalar tasarlamak için 
bir örnek olarak hazırlanmıştır. Projenin daha karmaşık ve gerçekçi işlevlere sahip bir mağaza yönetim paneline 
dönüştürülmesi mümkündür.



