package com.example.bee.model.request.update_request;

import com.example.bee.entity.TaiKhoan;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UpdatedGioHangRequest {
    private Long id;

    private String maGioHang;

    private String ghiChu;

    private LocalDateTime ngayTao;

    private LocalDateTime ngaySua;

    private Integer trangThai;

    private TaiKhoan taiKhoan;
}
