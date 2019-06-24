package Model;

public abstract class Buff {

    private Spell spellCard;
    private String nameOfBuff;
    protected int number;
    protected int turns;
    protected TypeOfBuff typeOfBuff;
    protected TimeOfBuff timeOfBuff;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTurns() {
        return turns;
    }

    public void setTurns(int turns) {
        this.turns = turns;
    }

    public TypeOfBuff getTypeOfBuff() {
        return typeOfBuff;
    }

    public void setTypeOfBuff(TypeOfBuff typeOfBuff) {
        this.typeOfBuff = typeOfBuff;
    }

    public TimeOfBuff getTimeOfBuff() {
        return timeOfBuff;
    }

    public void setTimeOfBuff(TimeOfBuff timeOfBuff) {
        this.timeOfBuff = timeOfBuff;
    }

    public Buff(int number, int turns, TypeOfBuff buffType, TimeOfBuff buffTImeType) {
        this.number = number;
        this.turns = turns;
        this.typeOfBuff = buffType;
        this.timeOfBuff = buffTImeType;
    }

    public void decrementTurns() {
        this.setTurns(this.turns--);
    }

    public abstract void applyBuff(Spell spellCard);

    public String getNameOfBuff() {
        return nameOfBuff;
    }

    public void setNameOfBuff(String nameOfBuff) {
        this.nameOfBuff = nameOfBuff;
    }

    public Spell getSpellCard() {
        return spellCard;
    }

    public void setSpellCard(Spell spellCard) {
        this.spellCard = spellCard;
    }
}