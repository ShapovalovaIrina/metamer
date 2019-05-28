/*
 * MIT License
 *
 * Copyright (c) 2019-present Denis Verkhoturov, Aleksandra Klimina,
 * Sophia Shalgueva, Irina Shapovalova, Anna Brusnitsyna
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package metamer.graph;

import java.util.Objects;

/**
 * Class - entity for nodes of de Bruijn graph.
 */
public class Node {
    public String kmer;
    public int nin;
    public int nout;

    /**
     * Constructor - initializing all fiealds.
     *
     * @param kmer String with current kmer.
     */
    Node(final String kmer) {
        this.kmer = kmer;
        this.nin = 0;
        this.nout = 0;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Node node = (Node)obj;
        return Objects.equals(this.kmer, node.kmer) && Objects.equals(this.nin, node.nin) &&
                Objects.equals(this.nout, node.nout);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.kmer);
    }

    @Override
    public String toString() {
        return " Kmer = " + this.kmer + ", nout = " + this.nout + ", nin = " + this.nin + " ";
    }

}