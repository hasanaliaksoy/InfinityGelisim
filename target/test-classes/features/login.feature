Feature: Infinity Gelişim Web Sitesi Test Senaryoları

  Scenario: Kullanıcı Adı Label'ı Doğrulaması
    Given Infinity Gelişim web sitesine erişilir
    When Kullanıcı adını label'ında placeholder olarak "E-Posta Adresiniz / E-mail" yazdığını doğrulayınız.
    Then Kullanıcı adı alanı veri girişine açık olduğunu doğrulayınız

  Scenario: Şifre Label'ı Doğrulaması
    Given Infinity Gelişim web sitesine erişilir
    When Şifre label'ında placeholder olarak "Şifreniz / Password" yazdığını doğrulayınız.
    Then Şifre alanı veri girişine açık olduğunu doğrulayınız.

  Scenario: Login Butonu Doğrulaması
    Given Infinity Gelişim web sitesine erişilir
    When Login butonunun mevcut olduğunu ve işlevsel olduğunu kontrol edin.


  Scenario: Şifremi Unuttum Butonu Doğrulaması
    Given Infinity Gelişim web sitesine erişilir
    When Şifremi Unuttum butonunun mevcut olduğunu ve işlevsel olduğunu kontrol edin.

  Scenario: Beni Hatırla Butonu Doğrulaması
    Given Infinity Gelişim web sitesine erişilir
    When Beni Hatırla butonunun mevcut olduğunu ve işlevsel olduğunu kontrol edin.

  Scenario: Recaptcha Doğrulaması
    Given Infinity Gelişim web sitesine erişilir
    When Recaptcha'nın mevcut olduğunu ve işlevsel olduğunu kontrol edin.

  Scenario: Hatalı Kullanıcı Adı Mesajı Doğrulaması
    Given Infinity Gelişim web sitesine erişilir
    When Kullanıcı adı alanına geçersiz bir kullanıcı adı girilir
    Then "Kullanıcı adı veya şifrenizi hatalı girdiniz. Lütfen tekrar deneyiniz.!" mesajının görüntülendiğini kontrol edin.

  Scenario: Hatalı Şifre Mesajı Doğrulaması
    Given Infinity Gelişim web sitesine erişilir
    When Şifre alanına geçersiz bir şifre girilir
    Then "Kullanıcı adı veya şifrenizi hatalı girdiniz. Lütfen tekrar deneyiniz.!" mesajının görüntülendiğini kontrol edin.

  Scenario: Şifremi Unuttum Hatalı Kullanıcı Adı Mesajı Doğrulaması
    Given Infinity Gelişim web sitesine erişilir
    When Şifre Al butonuna tıklanır ve geçersiz bir kullanıcı adı girilir
    Then Şifre yenileme e-posta SMS hatalı kullanıcı adı mesajı görüntülenir

  Scenario: Mobil Uygulama Butonları Doğrulaması
    Given Infinity Gelişim web sitesine erişilir
    When  Google Play butonunun mevcut olduğunu ve işlevsel olduğunu kontrol edin
    Then  App Store butonunun mevcut olduğunu ve işlevsel olduğunu kontrol edin