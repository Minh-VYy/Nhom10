/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH;

public class HinhChuNhat 
{
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) 
    {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhDienTich() 
    {
        return chieuDai * chieuRong;
    }

    public double tinhChuVi() 
    {
        return 2 * (chieuDai + chieuRong);
    }

    public void inKetQua() 
    {
        System.out.println("Diện tích: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
    }
}


public class SinhVien {
    Scanner scan=new Scanner(System.in);
    private String ma;
    private String ten;
    private String ngaysinh;
    private double dtb;
    
    public SinhVien(){
        
    }

    public SinhVien(String ma, String ten,  String  ngaysinh, double dtb) {
        this.ma = ma;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.dtb = dtb;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }
    public void nhapdulieu(){
        System.out.println("nhap ma");
        ma=scan.nextLine();
        System.out.println("nhap ten");
        ten=scan.nextLine();
        System.out.println("nhapngaysinh"+ngaysinh);
        String ngaysinh=scan.nextLine();
        System.out.println("nhap diem dtb");
        dtb=scan.nextDouble();
        
               
    }
   public String toString(){
       String res=String.format("-%20d%-%20s%-%20d%-5.2f",ma,ten,ngaysinh,dtb);
   return res;
   }
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SinhVien>danhSachSinhVien=new ArrayList<>();    
        System.out.print("Nhập số lượng sinh viên: ");
        int soLuongSinhVien = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < soLuongSinhVien; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
        
            SinhVien sv = new SinhVien();
            sv.nhapdulieu();  
            danhSachSinhVien.add(sv); // Thêm sinh viên vào danh sách
        }
        
        // Sắp xếp  
        Collections.sort(danhSachSinhVien,new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.getDtb(), sv1.getDtb()); // Sắp xếp giảm dần
            }
        });

        // In tiêu đề của bảng
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm trung bình giảm dần:");
        System.out.println("+------------+----------------------+-----------------+------------+");
        System.out.println("| Mã SV      | Tên sinh viên         | Ngày sinh       | Điểm TB    |");
        System.out.println("+------------+----------------------+-----------------+------------+");

       
        for (SinhVien sv : danhSachSinhVien) {
            System.out.println(sv);
        }
        System.out.println("+------------+----------------------+-----------------+------------+");
    }
}


public class bai3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        // Nhập thông tin tài khoản
        System.out.print("Nhập số tài khoản: ");
        String soTaiKhoan = scanner.nextLine();

        System.out.print("Nhập chủ tài khoản: ");
        String chuTaiKhoan = scanner.nextLine();

        System.out.print("Nhập số dư ban đầu: ");
        double soDu = scanner.nextDouble();

        // Tạo đối tượng TaiKhoan
        TaiKhoan taiKhoan = new TaiKhoan(soTaiKhoan, chuTaiKhoan, soDu);

        // Hiển thị thông tin tài khoản
        taiKhoan.hienThiThongTin();

        // Gửi tiền
        System.out.print("Nhập số tiền cần gửi: ");
        double soTienGui = scanner.nextDouble();
        taiKhoan.guiTien(soTienGui);

        // Rút tiền
        System.out.print("Nhập số tiền cần rút: ");
        double soTienRut = scanner.nextDouble();
        taiKhoan.rutTien(soTienRut);

        // Kiểm tra số dư
        System.out.println("Số dư hiện tại: " + taiKhoan.kiemTraSoDu());

        // Đóng scanner
        scanner.close();
    }
}
class TaiKhoan {
    // Thuộc tính
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;

    // Constructor
    public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
    }

    // Phương thức gửi tiền
    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Gửi tiền thành công: " + soTien);
        } else {
            System.out.println("Số tiền gửi không hợp lệ.");
        }
    }

    // Phương thức rút tiền
    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rút tiền thành công: " + soTien);
        } else {
            System.out.println("Số tiền rút không hợp lệ hoặc vượt quá số dư.");
        }
    }

    // Phương thức kiểm tra số dư
    public double kiemTraSoDu() {
        return soDu;
    }

    // Phương thức hiển thị thông tin tài khoản
    public void hienThiThongTin() {
        System.out.println("Số tài khoản: " + soTaiKhoan);
        System.out.println("Chủ tài khoản: " + chuTaiKhoan);
        System.out.println("Số dư: " + soDu);
    }
}