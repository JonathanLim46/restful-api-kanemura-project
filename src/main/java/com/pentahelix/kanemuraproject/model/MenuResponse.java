package com.pentahelix.kanemuraproject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MenuResponse {


    private Integer id;

    private String nama_menu;

    private String description;

    private Integer harga;

    private String kategori;

    private boolean signature;

}
