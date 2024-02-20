package tacos;

import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Taco {

	@NotNull
	@Size(min=5, message="Name must be atleast 5 characters long")
	private String name;
	
	@Size(min=3, message="You must choose at least 1 ingredient")
	private List<String> ingredients;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ingredients, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Taco other = (Taco) obj;
		return Objects.equals(ingredients, other.ingredients) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Taco [name=" + name + ", ingredients=" + ingredients + "]";
	}

}
