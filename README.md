# Bài 6 - Cache Maven

Workflow cấu hình `cache: maven` trong `actions/setup-java@v4` để tái sử dụng Maven dependencies nằm trong `~/.m2/repository`. Lệnh `./run.sh` dùng để kiểm tra bài trên máy.

**Minh chứng cần tự tạo trên GitHub:**

1. Để có số liệu **trước khi bật cache**, tạm xóa riêng dòng `cache: maven` trong workflow, push rồi ghi thời gian chạy và log setup-java (lần A).
2. Thêm lại dòng `cache: maven`, push để tạo cache lần đầu (lần B). Có thể thấy chưa có cache tương ứng; sau khi job thành công, cache được lưu.
3. Giữ nguyên `pom.xml` và workflow; chỉ sửa một dòng giải thích trong README rồi push (lần C). Kiểm tra setup-java có log cache được khôi phục (`Cache restored from key` hoặc thông báo cache hit), ghi thời gian lần C.

So sánh thời gian **A và C** để đánh giá trước/sau caching; dùng **B và C** để chứng minh đã tái sử dụng cache. Kết quả thời gian có thể chịu ảnh hưởng mạng và tốc độ runner. Không tự điền thời gian nếu chưa có log thực tế. Nếu đề chỉ yêu cầu hai lần push, trình bày rõ lần chạy B để giải thích vì sao muốn thấy cache hit phải có lượt sau khi tạo cache.
