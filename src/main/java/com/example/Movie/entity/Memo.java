package com.example.Movie.entity;

import lombok.*;
import net.bytebuddy.build.ToStringPlugin;

import javax.persistence.*;

@Entity
@Table(name = "tbl_memo")
@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;
}


