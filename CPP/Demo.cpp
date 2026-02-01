class Solution {
public:
    {
    using namespace std;
        for (auto it = s.begin();it!=s.end();it++)
        {
            if (*it=='(')
            {
                auto next_it = ++it;
                if (next_it!=s.end() && *next_it==')')
                    present = true;
            }
        }
    }
};