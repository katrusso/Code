public class BsSimulator {
	public static void main(String[] args) {
		BSHealthAndFitnessData bsHealthAndFitnessData = new BSHealthAndFitnessData();

		SummaryDisplay summaryDisplay = new SummaryDisplay(bsHealthAndFitnessData);
		PillDisplay pillDisplay = new PillDisplay(bsHealthAndFitnessData);
		EquipmentDisplay equipmentDisplay = new EquipmentDisplay(bsHealthAndFitnessData);

		bsHealthAndFitnessData.removeObserver(equipmentDisplay);
		//bsHealthAndFitnessData.removeObserver(pillDisplay);


		bsHealthAndFitnessData.setData("SkinnyPills", "The Fat Vacuum", "The Potato and Toast Diet");
		bsHealthAndFitnessData.setData("Barf Pills", "Fat-Away Rotating Chair", "The Cracker Crumb and Applesauce Diet");

	}
}