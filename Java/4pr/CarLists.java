import java.util.ArrayList;
public class CarLists {
        private ArrayList <TechnicalService> avto;

        public CarLists() {
            avto = new ArrayList<TechnicalService>();
        }

        public void Add(TechnicalService auto) {
            avto.add(auto);
        }

        public String toString() {
            String str = "";
            for (int i=0; i<avto.size(); i++) {
                str += avto.get(i);
                str += "\n\n";
            }
            return str;
        }
    }

