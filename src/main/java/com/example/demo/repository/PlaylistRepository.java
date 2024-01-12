package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Playlist;
import com.example.demo.entity.Song;

public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {

}
