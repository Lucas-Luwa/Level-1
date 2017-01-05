
public class HouseRunner {
	public static void main(String[] args) {
		HouseMaker Home = new HouseMaker();
		Home.SetRobotInCorner();
		Home.SetColorOfHouse(873, 013, 226);
		// Home.DrawFlatRoof();
		// Home.DrawPointyRoof();
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				Home.SetHeightOfHouse("large");
				Home.DrawAHouse();
			}
			if (i % 2 == 1) {
				Home.SetHeightOfHouse("medium");
				Home.DrawNoRoofHouse();
			}
		}
	}
}
