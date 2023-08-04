# MyList - Bir Genel Liste Uygulaması

MyList, Java dilinde genel bir liste uygulamasını sağlayan bir sınıftır ve herhangi bir veri türü (T) için liste oluşturmanıza izin verir (Generic Type). Java'nın yerleşik ArrayList sınıfına benzer işlevselliğe sahiptir.

### Kullanım

MyList sınıfını Java projenize import edin.
Yeni bir MyList örneği oluşturun ve gerektiğinde veri türünü belirtin.
Listedeki elemanları manipüle etmek ve erişmek için çeşitli yöntemleri kullanın.

### Kurucular

MyList(): Varsayılan başlangıç kapasitesi 10 olan yeni bir MyList örneği oluşturur.
MyList(int CAPACITY): Belirtilen başlangıç kapasitesiyle yeni bir MyList örneği oluşturur.

### Genel Metodlar

1- add(T element): Verilen elemanı listenin sonuna ekler. Liste kapasitesine ulaşırsa, otomatik olarak boyutunu iki katına çıkarır.

2- get(int index): Belirtilen indeksteki elemanı döndürür. İndeks sınırları dışındaysa null döndürür.

3- remove(int index): Belirtilen indeksteki elemanı listeden kaldırır ve geri kalan elemanları ilgili şekilde kaydırır.

4- set(int index, T element): Belirtilen indeksteki elemanı verilen elemanla değiştirir.

5- indexOf(T element): Belirtilen elemanın listenin ilk bulunduğu indeksi döndürür. Eleman bulunamazsa -1 döndürür.

6- lastIndexOf(T element): Belirtilen elemanın listenin son bulunduğu indeksi döndürür. Eleman bulunamazsa -1 döndürür.

7- isEmpty(): Listenin boş olup olmadığını kontrol eder.

8- toArray(): Listeyi T türünde bir diziye dönüştürür.

9- clear(): Listeyi temizler, boşaltır.

### Diğer Metodlar

1- sublist(int start, int finish): Başlangıç ve bitiş indeksleri arasındaki elemanları içeren yeni bir MyList döndürür.

2- contains(T element): Liste, belirtilen elemanı içeriyorsa true döndürür, aksi takdirde false döndürür.

### Notlar

1- Listenin başlangıç kapasitesi 10 olarak ayarlanmış olsa da, kapasiteye ulaştığında boyutunu verimli bir şekilde yeniden boyutlandırmak için otomatik olarak iki katına çıkarılır.

2- Sınıf, eşzamanlı değişiklikleri ele almaz ve bu nedenle çoklu iş parçacıklı ortamlarda güvenli olmayabilir. Eşzamanlı değişiklikleri ele almak için Java Collections Framework'ünü kullanmayı düşünebilirsiniz.