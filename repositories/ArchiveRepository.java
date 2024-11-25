package repositories;

import models.Archive;

import java.util.ArrayList;
import java.util.List;

public class ArchiveRepository implements Repository<Archive> {
    private List<Archive> archives = new ArrayList<>();

    @Override
    public void save(Archive archive) {
        archives.add(archive);
    }

    @Override
    public Archive findById(Long id) {
        return archives.stream()
                .filter(archive -> archive.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(Long id) {
        archives.removeIf(archive -> archive.getId().equals(id));
    }

    @Override
    public List<Archive> findAll() {
        return new ArrayList<>(archives);
    }
}
