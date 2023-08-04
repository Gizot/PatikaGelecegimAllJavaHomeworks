# Jeneriklerle Kitap Sınıfı ve Sıralama Uygulaması

Bu Java projesi, "Book" adında bir jenerik sınıf içerir. 
Bu sınıf, kitapları temsil etmek için kullanılır ve kitapların başlık, sayfa sayısı, yazar adı 
ve yayın tarihi gibi bilgilerini içerir. Ayrıca, "Comparable" arayüzünü uygulayarak kitapları
başlık alanına göre doğal bir sıralamaya tabi tutar. 
Ayrıca, kitapları sayfa sayısına göre sıralamak için bir "Comparator" nesnesi kullanır.


# Ana Sınıf (Main)

Ana sınıf, "Book" sınıfını kullanarak kitapları 
bir "TreeSet" veri yapısında başlık alanına göre ve sayfa sayısına göre sıralar ve ekrana yazdırır.
TreeSet veri yapısı, kitapları otomatik olarak sıralamamıza olanak tanır ve TreeSet içindeki öğeler
otomatik olarak doğal sıraya göre veya belirli bir kriter (Comparator) doğrultusunda sıralanır.

# NOTLAR 

- Comparable ve Comparator arayüzleri, sıralama işlemlerinde kullanılmak üzere nesne karşılaştırmalarını sağlamak için 
kullanılır.
- TreeSet veri yapısı, öğeleri sıralı bir şekilde depolar ve elemanları otomatik olarak sıralar.
compareTo() ve compare() metodları, öğelerin karşılaştırılmasında kullanılır ve sıralama için temel belirler.