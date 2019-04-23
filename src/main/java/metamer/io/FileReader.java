package metamer.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.stream.Stream;

public class FileReader<T> implements Reader {
    private Path path;
    private Parser<T> parser;

    public FileReader(final Path path, final Parser<T> parser) {
        this.path = path;
        this.parser = parser;
    }

    public Path path() {
        return this.path;
    }

    public Parser<T> parser() {
        return this.parser;
    }

    public Stream<T> read() {
        try (final Stream<String> lines = Files.lines(path)) {
            return this.parser().read(lines);
        } catch (final IOException e) {
            throw new RuntimeException("Can't parse :(");
        }
    }

}
