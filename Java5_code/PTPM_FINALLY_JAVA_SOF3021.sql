USE [master]

CREATE DATABASE [PTPM_FINALLY_JAVA_SOF3021]
GO

USE [PTPM_FINALLY_JAVA_SOF3021]
GO

CREATE TABLE HangKhachHang(
	MaHang			INT	
		IDENTITY(1,1) PRIMARY KEY,
	TenHang			NVARCHAR(50),
	MoTa			NVARCHAR(MAX),
	DiemToiThieu	INT NOT NULL,
	TrangThai		INT
)
GO

CREATE TABLE KhachHang(
	MaKhachHang		BIGINT	
		IDENTITY(1,1) PRIMARY KEY,
	TenKhachHang	NVARCHAR(50),
	SinhNhat		DATE,
	DiaChi			NVARCHAR(MAX),
	SoDienThoai		VARCHAR(15) ,
	Email			VARCHAR(50) ,
	GioiTinh		BIT,
	ChungMinhThu	VARCHAR(15)	,
	SoCanCuoc		VARCHAR(15)	,
	AnhDaiDien		VARCHAR(50), -- Link anh
	TrangThai		INT,
	DiemTichLuy		INT DEFAULT 0, --Mac dinh 0

	HangKhachHang	INT	
		REFERENCES HangKhachHang(MaHang),
	NguoiGioiThieu	BIGINT 
		REFERENCES KhachHang(MaKhachHang)
)
GO

CREATE TABLE TheThanhVien(
	MaThe			VARCHAR(50) PRIMARY KEY,
	MauThe			NVARCHAR(10),
	LoaiThe			NVARCHAR(10),
	NgayPhatHanh	DATE,
	NgayHuy			DATE,
	TrangThai		INT,

	NguoiSoHuu		BIGINT 
		REFERENCES KhachHang(MaKhachHang)
)
GO

CREATE TABLE PhieuGiamGia(
	MaPhieu			VARCHAR(10) PRIMARY KEY,
	TenPhieu		NVARCHAR(20),
	NgayBatDau		DATE,
	NgayKetThuc		DATE,
	GiaTriGiam		MONEY,
	GiaTriGiamToiDa	MONEY,
	HinhThucGiam	BIT, -- % hay gia tien
	TrangThai		INT,

	NguoiSoHuu		BIGINT 
		REFERENCES KhachHang(MaKhachHang)
)
GO

CREATE TABLE DiaChi (
	MaDiaChi		UNIQUEIDENTIFIER 
		DEFAULT NEWID() PRIMARY KEY,
	TenDiaChi		NVARCHAR(50),
	MoTaChiTiet		NVARCHAR(MAX),
	TinhThanhPho	NVARCHAR(50),
	QuanHuyen		NVARCHAR(50),
	PhuongXa		NVARCHAR(50),
	DuongPho		NVARCHAR(50),

	KhachHang		BIGINT	
		REFERENCES KhachHang(MaKhachHang),
)
GO

CREATE TABLE SanPham(
	MaSanPham	BIGINT	
		IDENTITY(1,1) PRIMARY KEY,
	TenSanPham	NVARCHAR(100),
	ChatLieu	NVARCHAR(100),
	GiaHienHanh	MONEY,
	SoLuongTon	INT,
	MoTa		NVARCHAR(MAX),
	LoaiSanPham	NVARCHAR(50),
	MauSac		NVARCHAR(20),
	NhaSanXuat	NVARCHAR(20),
	TrangThai	INT,
)
GO

CREATE TABLE HoaDon(
	MaHoaDon		BIGINT	
		IDENTITY(1,1) PRIMARY KEY,
	NgayLap			DATE,
	NguoiLap		NVARCHAR(50),
	GhiChu			NVARCHAR(MAX),
	NgayThanhToan	DATE,
	TrangThai		INT,

	NguoiMua		BIGINT	
		REFERENCES KhachHang(MaKhachHang),
)
GO

CREATE TABLE HoaDonChiTiet(
	MaHoaDon	BIGINT
		REFERENCES HoaDon(MaHoaDon),
	MaSanPham	BIGINT
		REFERENCES SanPham(MaSanPham),
	SoLuong		INT,
	DonGia		MONEY,

	GhiChu		NVARCHAR(MAX),
	TrangThai	INT,	
	
	PRIMARY KEY (MaHoaDon, MaSanPham)				
)
GO

CREATE TABLE PhieuGiaoHang(
	MaPhieuGiao	UNIQUEIDENTIFIER 
		DEFAULT NEWID() PRIMARY KEY,
	
	NguoiNhan	NVARCHAR(50),
	SdtNhan		VARCHAR(20),

	NguoiGiao	NVARCHAR(50),
	SdtGiao		VARCHAR(20),
	NgayGiao	DATE,
	NgayNhan	DATE,

	NguoiTao	NVARCHAR(50),
	PhiGiaoHang	MONEY,

	HoaDonGiao	BIGINT 
		REFERENCES HoaDon(MaHoaDon),
	DiaChiGiao	UNIQUEIDENTIFIER
		REFERENCES DiaChi(MaDiaChi),

	GhiChu		NVARCHAR(MAX),
	TrangThai	INT,
)

CREATE TABLE GioHang(
	MaGioHang	UNIQUEIDENTIFIER 
		DEFAULT NEWID() PRIMARY KEY,
	NgayTao		DATE,
	NgayCapNhap	DATE,

	NguoiSoHuu	BIGINT 
		REFERENCES KhachHang(MaKhachHang),
	
	GhiChu		NVARCHAR(MAX),
	TrangThai	INT,
)
GO

CREATE TABLE GioHangChiTiet(
	MaGioHang	UNIQUEIDENTIFIER
		REFERENCES GioHang(MaGioHang),
	MaSanPham	BIGINT
		REFERENCES SanPham(MaSanPham),

	SoLuong		INT,

	GhiChu		NVARCHAR(MAX),
	TrangThai	INT,

	PRIMARY KEY (MaGioHang, MaSanPham)
)
GO

CREATE TABLE DanhSachYeuThich(	
	MaDanhSach	UNIQUEIDENTIFIER 
		DEFAULT NEWID() PRIMARY KEY,
	NgayTao		DATE,
	NgayCapNhap	DATE,

	NguoiSoHuu	BIGINT 
		REFERENCES KhachHang(MaKhachHang),
	
	GhiChu		NVARCHAR(MAX),
	TrangThai	INT,
)
GO

CREATE TABLE YeuThichChiTiet(
	MaDanhSach	UNIQUEIDENTIFIER
		REFERENCES DanhSachYeuThich(MaDanhSach),
	MaSanPham	BIGINT
		REFERENCES SanPham(MaSanPham),

	GhiChu		NVARCHAR(MAX),
	TrangThai	INT,

	PRIMARY KEY (MaDanhSach, MaSanPham)
)