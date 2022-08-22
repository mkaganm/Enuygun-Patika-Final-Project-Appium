# APPIUM TEST

[APK](https://github.com/movilidadagil/ContactManagerAPIProject/tree/master/src/test/resources/apps) - Linkteki apk için test senaryoları oluşturuldu ve test edildi.


[android-oreo.json](https://github.com/mkaganm/Enuygun-Patika-Final-Project-Appium/blob/master/src/test/resources/config/android-oreo.json) - Android ayarlarını buradan çekiyor başka cihazda çalıştırmak için burayı düzenleyiniz.

``` JSON
{
  "platformName": "Android",
  "appium:deviceName": "oreo",
  "appium:automationName": "FinalProject",
  "appium:udid": "emulator-5554",
  "appium:avd": "Pixel_4_API_27",
  "appium:app": "C:\\Users\\mkaga\\IdeaProjects\\FinalProjectMobile\\src\\test\\resources\\config\\android-oreo.json"
}
``` 

Senaryolar

- Kullanıcı kaydı
- Kullanıcı girişi
- Başarısız kullanıcı girişi
- Müşteri ekleme
- Müşteri arama

![](https://github.com/mkaganm/Enuygun-Patika-Final-Project/blob/main/images/phone.png)

## TECH

- Appium
- Android studio

Test için appium kullanıldı.

Sanal android cihaz Android studio'dan oluşturuldu.

---

[MobileTest](https://github.com/mkaganm/Enuygun-Patika-Final-Project-Appium/blob/master/src/test/java/MobileTest/MobileTest.java) - Testlerin bulunduğu sınıf

[Model](https://github.com/mkaganm/Enuygun-Patika-Final-Project-Appium/tree/master/src/test/java/Mobile/Model) - kullanılan model sınıfları

[PatikaAPK](https://github.com/mkaganm/Enuygun-Patika-Final-Project-Appium/blob/master/src/test/java/Mobile/PatikaAPK.java) - Apk için ana sayfa bu sayfayı diğer sınıflar extend ediyor. Page factory bu sayfadadır.

[PatikaLoginPage](https://github.com/mkaganm/Enuygun-Patika-Final-Project-Appium/blob/master/src/test/java/Mobile/PatikaLoginPage.java) - apk kullanıcı giriş sayfası sınıfı

[PatikaRegisterPage](https://github.com/mkaganm/Enuygun-Patika-Final-Project-Appium/blob/master/src/test/java/Mobile/PatikaRegisterPage.java) - apk kullanıcı kayıt sayfası

[PatikaHomePAge](https://github.com/mkaganm/Enuygun-Patika-Final-Project-Appium/blob/master/src/test/java/Mobile/PatikaHomePage.java) - apk anasayfa

[PatikaAddPAge](https://github.com/mkaganm/Enuygun-Patika-Final-Project-Appium/blob/master/src/test/java/Mobile/PatikaAddPage.java) - apk müşteri ekleme sayfası

[PatikaSearchPage](https://github.com/mkaganm/Enuygun-Patika-Final-Project-Appium/blob/master/src/test/java/Mobile/PatikaSearchPage.java) - apk müşteri arama sayfası

[MKagan](https://github.com/mkaganm/Enuygun-Patika-Final-Project-Appium/tree/master/src/test/java/MKagan) - Appium hızlı başlangıç için oluşturduğum paket

## RESULTS

![](https://github.com/mkaganm/Enuygun-Patika-Final-Project/blob/main/images/mobileallure.png)

# AUTHOR - [M.Kağan Meriç](https://github.com/mkaganm)
