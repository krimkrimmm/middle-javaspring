//Yêu cầu
//1. Tạo model
//Học viên tạo model với cấu trúc như sau:
//
//👉 Model Product
//
//id : int - Mã sản phẩm
//name : String - Tên sản phẩm
//description : String - Mô tả của sản phẩm
//thumbnail : String - Ảnh đại diện của sản phẩm
//price: int - Giá sản phẩm
//rating: double - Đánh giá sản phẩm (1 -> 5 sao)
//priceDiscount: int - Giá sau khi giảm (nếu có) (nếu không có giảm giá thì = null)
//2. Tạo dữ liệu
//Học viên sử dụng trang https://www.mockaroo.com để tạo dữ liệu cho sản phẩm (Nếu quên cách mockup xem lại Video : Mockup dữ liệu sử dụng Mockaroo)
//Dữ liệu được tạo ra khoảng 30 -> 50 bản ghi
//Dữ liệu xuất ra file theo một trong các định dạng sau: JSON, Excel, CSV
//3. Yêu cầu
//Yêu cầu giao diện
//Giao diện sáng sủa, dễ nhìn
//Giao diện đẹp, chỉn chu là một lợi thế (được cộng thêm điểm)
//Tham khảo 1 số trang web danh sách sản phẩm để tạo ra trang web đẹp :
//https://www.watchstore.vn/
//https://routine.vn/new-arrivals.html
//https://cellphones.com.vn/
//Yêu cầu chức năng
//Đọc dữ liệu từ file đã được tạo ở bước trên -> sau đó lưu vào trong Collection để sử dụng
//Ứng dụng tuân thủ mô hình three-layer (controller, service, repo)
//Viết API trả về trả về dữ liệu sản phẩm và hiển thị nó ở bằng Thymeleaf bao gồm:
//Danh sách sản phẩm : GET http://localhost:8080
//Chi tiết sản phẩm: GET http://localhost:8080/products/{id}
//Khuyến khích học viên bổ sung thêm các chức năng khác của liên quan đến trang web như : Tìm kiếm, phân trang, lọc dữ liệu, …
//4. Nộp bài
//Học viên push code lên trên github và nộp lại bài sau khi kết thúc bài kiểm tra
//Viết file REAME.md chụp lại ảnh màn hình giao diện web và bổ sung thêm tin về flow, các chức năng khác của trang web (nếu có)
//Các bài phát hiện có yếu tố trùng nhau (copy bài của nhau) -> 0 điểm
//5. Chấm điểm
//Hoàn thiện các yêu cầu ở trên: 6 điểm
//Bổ sung các tính năng nâng cao (tìm kiếm, sắp xếp, lọc dữ liệu, phân trang, …): 2 điểm
//Giao diện đẹp, thân thiện với người dùng: 2 điểm
package vn.scrip.middle_giuakhoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class MiddleGiuakhoaApplication
{

	public static void main(String[] args) {
		SpringApplication.run(MiddleGiuakhoaApplication.class, args);
	}
}








