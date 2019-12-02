package lab
//
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

public class Dictionary {
	
	Map<Word,Set<Word>> map = new HashMap<Word,Set<Word>>();
	
	/**
	 * * Lägger till termen t till ordlistan med betydelsen m.
	 * Om termen redan är tillagd med angiven betydelse händer ingenting.
	 */
	
	public void add(Word t, Word m) {
		// Kolla om t finns i map
		// om inte, skapa ny set och lägg in m i set, mappa t till set
		// om innehåller: hitta set t pekade på och lägg in m
		map.put(t, m);
	}
	
	/**
	 * Bekvämare sätt att anropa add för 2 strängar än
	 * add(Word, Word
	 */
	
	public void add(String t, String m) {
		add(new Word(t), new Word(m));
	}
	
	/* 
	 * Returnerar en icke-null mängd med ordlistans alla termer.
	 */
	public Set<Word> term() {
		return null;
	}
	
	/* 
	 * Slår upp och returnerar en mängd av betydelser till t,
	 * eller null om t inte finns i ordlistan
	 */
	
	public Set<Word> lookup(Word t) {
		return null;
	}
	
	/* 
	 * Skapar och returnerar en ny ordlista på det motsatta språket,
	 * dvs, alla betydelser blir termer och alla termer blir betydelser.
	 * T.ex en svensk-engelsk ordlist blir efter invertering engels-svensk.
	 */
	
	
	public Dictionary inverse() {
		return null;
	}
	
	/* 
	 * Läser in orden från den givna strömmen och lägger dessa i ordlistan.
	 */
	
	public void load(InputStream is) {
	}
	
	/* 
	 * Lagrar ordlistan på den givna strömmen.
	 */
	
	public void save(OutputStream os) {
	}
	
	
}
