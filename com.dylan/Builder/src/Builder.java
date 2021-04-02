interface Builder {
    Builder startUpOperations(String startUpMessage);
    Builder buildBody(String bodyType);
    Builder insertWheels(int noOfWheels);
    Builder addHeadlights(int noOfHeadLights);
    Builder endOperations(String endOperationsMessage);

    Product constructCar();
    Product getConstructedCar();

}
