## 1. Singleton Pattern
**Lý thuyết:** Đảm bảo một class chỉ có duy nhất một instance trong toàn bộ ứng dụng và cung cấp điểm truy cập toàn cục đến instance đó.

**Ví dụ sử dụng:** Kết nối database - chỉ cần một kết nối duy nhất cho toàn app, không tạo nhiều kết nối gây lãng phí tài nguyên. Logger để ghi log - chỉ cần một đối tượng ghi log chung cho toàn ứng dụng.

## 2. Factory Pattern
**Lý thuyết:** Tạo ra các đối tượng mà không cần chỉ định chính xác class của chúng, thay vào đó sử dụng một factory class để quyết định tạo đối tượng nào.

**Ví dụ sử dụng:** Tạo các loại phương tiện giao thông - nhập "car" thì tạo Car, nhập "bike" thì tạo Bike mà không cần biết chi tiết cách tạo. Tạo các loại báo cáo - PDF, Excel, Word dựa trên yêu cầu người dùng.

## 3. Builder Pattern
**Lý thuyết:** Xây dựng các đối tượng phức tạp từng bước một cách rõ ràng, cho phép tạo ra các biến thể khác nhau của cùng một đối tượng.

**Ví dụ sử dụng:** Xây dựng một ngôi nhà - từng bước: móng, tường, mái, cửa. Tạo pizza - chọn đế, sauce, topping từng bước. Tạo SQL query phức tạp - từng bước SELECT, FROM, WHERE, ORDER BY.

## 4. Prototype Pattern
**Lý thuyết:** Tạo đối tượng mới bằng cách sao chép (clone) từ một đối tượng mẫu có sẵn thay vì tạo mới từ đầu.

**Ví dụ sử dụng:** Tạo nhiều enemy trong game giống nhau - clone từ một enemy mẫu thay vì tạo mới từ đầu tốn thời gian. Sao chép document template - có template Word sẵn, chỉ việc copy và sửa nội dung.

## 5. Adapter Pattern
**Lý thuyết:** Cho phép các class có interface không tương thích làm việc được với nhau bằng cách tạo một lớp trung gian chuyển đổi interface.

**Ví dụ sử dụng:** Sạc điện thoại - cắm sạc iPhone vào ổ cắm Android qua adapter. Tích hợp API cũ với hệ thống mới - API cũ trả JSON format A, hệ thống mới cần format B, dùng adapter chuyển đổi.

## 6. Composite Pattern
**Lý thuyết:** Xử lý cấu trúc phân cấp dạng cây, cho phép client xử lý đối tượng đơn lẻ và nhóm đối tượng theo cách giống nhau.

**Ví dụ sử dụng:** Hệ thống file - thư mục chứa file và thư mục con, có thể copy/delete cả thư mục hoặc từng file riêng lẻ. Menu ứng dụng - menu chính chứa submenu, submenu chứa menu item, tất cả đều có thể click được.

## 7. Decorator Pattern
**Lý thuyết:** Thêm tính năng mới cho đối tượng một cách linh hoạt mà không sửa đổi class gốc, có thể kết hợp nhiều decorator với nhau.

**Ví dụ sử dụng:** Coffee shop - cà phê cơ bản + thêm sữa + thêm đường + thêm syrup, mỗi lần thêm là một decorator. Text editor - text thường + bold + italic + underline, tùy chọn kết hợp.

## 8. Flyweight Pattern
**Lý thuyết:** Tiết kiệm bộ nhớ bằng cách chia sẻ dữ liệu chung giữa nhiều đối tượng tương tự nhau, chỉ lưu trữ dữ liệu khác biệt riêng lẻ.

**Ví dụ sử dụng:** Game có 1000 con lính - thay vì tạo 1000 object, chỉ tạo một object "Soldier" chung, mỗi lính chỉ lưu vị trí riêng. Text editor - chữ cái 'A' xuất hiện 100 lần, chỉ lưu 1 object 'A', 100 vị trí khác nhau.

## 9. Iterator Pattern
**Lý thuyết:** Cung cấp cách duyệt tuần tự các phần tử trong collection mà không cần biết cấu trúc bên trong của collection đó.

**Ví dụ sử dụng:** Duyệt danh sách bài hát - dù playlist lưu trong Array, LinkedList hay Tree thì vẫn duyệt được bằng next(), previous(). Duyệt menu nhà hàng - món khai vị, món chính, tráng miệng theo thứ tự mà không cần biết cách lưu trữ.

## 10. State Pattern
**Lý thuyết:** Cho phép đối tượng thay đổi hành vi khi trạng thái internal thay đổi, như thể đối tượng đã đổi class.

**Ví dụ sử dụng:** Máy bán nước - trạng thái "chờ tiền" chỉ nhận tiền, trạng thái "đã có tiền" cho phép chọn nước, trạng thái "đang pha" không nhận input. Game character - trạng thái "đứng" có thể nhảy/chạy, trạng thái "nhảy" không thể nhảy tiếp.



