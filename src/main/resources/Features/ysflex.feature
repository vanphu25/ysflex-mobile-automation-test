
Feature: Kiem tra ysflex app
  @Smoke
  Scenario: kiem tra dang nhap
    Given Mo app ysflex
    When Dang nhap voi tai khoan "002034" va mat khau "hello1" va kiem tra cac tab hien thi
    Then Dong ung dung

  
#    When Nhan nut Allow
#    And Di chuyen den trang dang nhap
#    And Dang nhap voi tai khoan "002034" va mat khau "hello1"
#    Then Di chuyen den trang chu
#    When Nhap OTP
#    Then kiem tra man hinh market hien thi
#    When Click Asset Management menu
#    Then kiem tra man hinh Asset Management hien day du
#    When Click Place Order menu
#    Then kiem tra man hinh Place Order hien day du
#    When Click news menu
#    Then kiem tra man hinh news hien day du
#    When Click service menu
#    Then kiem tra man hinh service hien day du

