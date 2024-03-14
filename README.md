# Kitapyurdu Mobil Uygulaması Test Otomasyonu

Bu proje, Kitapyurdu mobil uygulamasının test otomasyonunu gerçekleştirmek için Java ve Selenium ile oluşturulmuş bir projedir. Ayrıca testlerin düzenlenmesi ve raporlanması için Gauge kullanılmıştır.

## Başlangıç

Bu adımlar, projeyi yerel bir geliştirme ortamında çalıştırmak için gereken ön adımları içerir.

### Önkoşullar

Projenin çalıştırılabilmesi için aşağıdaki yazılımların bilgisayarınızda yüklü olması gerekmektedir:

- Java Development Kit (JDK)
- Maven
- Selenium WebDriver
- Gauge

### Kurulum

1. JDK'nın yüklü olduğundan emin olun.

2. Maven'i yükleyin:
   ```
   $ sudo apt install maven
   ```

3. Selenium WebDriver ve Gauge kütüphanelerini projeye ekleyin:
   ```
   $ mvn install
   ```

## Testleri Çalıştırma

Projeyi klonlayın ve proje klasörüne gidin:
```
$ git clone https://github.com/mecoskunn/KitapYurduHackhatonMobil.git
$ cd kitapyurdu-mobil-uygulama-otomasyon
```

Ardından aşağıdaki komutu kullanarak testleri çalıştırın:
```
$ mvn test
```

## Katkıda Bulunma

1. Bu depoyu fork edin.
2. Yeni bir özellik dalı oluşturun (`git checkout -b feature/YeniÖzellik`)
3. Yapmak istediğiniz değişiklikleri yapın ve değişikliklerinizi belgeleyin.
4. Değişikliklerinizi doğrulamak için testleri çalıştırın (`mvn test`)
5. Değişikliklerinizi yapmak için bir pull isteği gönderin.

## Lisans

Bu proje MIT lisansı altında lisanslanmıştır. Daha fazla bilgi için [LICENSE](LICENSE) dosyasına başvurun.